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

public class Ejercicio6 {
    public static void main(String[] args) {
        double ingreso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su ingreso mensual ($):"));
        
        if (ingreso <= 1500) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, no aplica para un préstamo.");
        } else {
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del préstamo deseado ($):"));
            double tasa;

            if (ingreso > 3000) {
                tasa = 0.05;
            } else {
                tasa = 0.07;
            }

            double interes = monto * tasa;
            double total = monto + interes;

            JOptionPane.showMessageDialog(null,
                "Tasa de interés: " + (tasa * 100) + "%\n" +
                "Interés a pagar: $" + interes + "\n" +
                "Monto total a pagar: $" + total);
        }
    }
}
