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

public class Ejercicio5 {
    public static void main(String[] args) {
        String contrasena = JOptionPane.showInputDialog("Cree su contraseña:");

        if (contrasena.length() >= 8) {
            JOptionPane.showMessageDialog(null, "La contraseña es válida.");
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña NO es válida. Debe tener al menos 8 caracteres.");
        }
    }
}
