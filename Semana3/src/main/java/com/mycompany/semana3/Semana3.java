/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana3;
import javax.swing.JOptionPane;

/**
 *
 * @author Norelys
 */
public class Semana3 {
    
     //Ejercicio 1

   public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");

        boolean nombreCorrecto = nombre.equals(nombre.toUpperCase());
        boolean apellidoCorrecto = apellido.equals(apellido.toLowerCase());

        if (nombreCorrecto && apellidoCorrecto) {
            JOptionPane.showMessageDialog(null, "El formato es correcto: " + nombre + " " + apellido);
        }
    }
}
