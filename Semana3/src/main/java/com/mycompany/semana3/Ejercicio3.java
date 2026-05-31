/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;
import javax.swing.JOptionPane;

/**
 *
 * @author Norelys
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        String libro = JOptionPane.showInputDialog("Ingrese el nombre del libro:");

        if (libro.equals(libro.toUpperCase()) || libro.equals(libro.toLowerCase())) {
            libro = libro.substring(0, 1).toUpperCase() + libro.substring(1).toLowerCase();
        }

        JOptionPane.showMessageDialog(null, "Título corregido: " + libro);
    }
}
