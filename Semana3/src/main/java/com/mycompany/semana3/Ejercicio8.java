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

public class Ejercicio8 {
    public static void main(String[] args) {
        int articulos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos artículos compró?"));
        double monto = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto gastó en total ($)?"));

        double descuento;

        if (articulos > 5 && monto > 100) {
            descuento = 0.10;
        } else if (articulos >= 3 || monto > 50) {
            descuento = 0.05;
        } else {
            descuento = 0;
        }

        JOptionPane.showMessageDialog(null,
            "Descuento aplicado: " + (descuento * 100) + "%\n" +
            "Ahorro: $" + (monto * descuento) + "\n" +
            "Total a pagar: $" + (monto - monto * descuento));
    }
}
