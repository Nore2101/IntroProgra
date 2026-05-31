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

public class Ejercicio4 {
    public static void main(String[] args) {
        String platillo = JOptionPane.showInputDialog("Ingrese el nombre del platillo:");

        if (platillo.toLowerCase().contains("vegetariano")) {
            JOptionPane.showMessageDialog(null, "Este platillo ES vegetariano.");
        } else {
            JOptionPane.showMessageDialog(null, "Este platillo NO es vegetariano.");
        }
    }
}
