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

public class Ejercicio2 {
    public static void main(String[] args) {
        String titulo = JOptionPane.showInputDialog("Ingrese el título de la noticia:");

        if (titulo.length() > 15) {
            titulo = titulo.substring(0, 15) + "...";
        }

        JOptionPane.showMessageDialog(null, "Título final: " + titulo);
    }
}
