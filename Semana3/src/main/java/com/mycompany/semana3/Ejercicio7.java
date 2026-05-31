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

public class Ejercicio7 {
    public static void main(String[] args) {
        int esProfesor = JOptionPane.showConfirmDialog(null, "¿Es usted profesor?", "Tipo de usuario", JOptionPane.YES_NO_OPTION);
        int sancionado = JOptionPane.showConfirmDialog(null, "¿Ha sido sancionado?", "Sanción", JOptionPane.YES_NO_OPTION);
        int correoConfirmado = JOptionPane.showConfirmDialog(null, "¿Ha confirmado su correo electrónico?", "Correo", JOptionPane.YES_NO_OPTION);

        boolean esPro = (esProfesor == JOptionPane.YES_OPTION);
        boolean estaSancionado = (sancionado == JOptionPane.YES_OPTION);
        boolean correoOk = (correoConfirmado == JOptionPane.YES_OPTION);

        if (esPro) {
            JOptionPane.showMessageDialog(null, "Acceso concedido. Bienvenido, Profesor.");
        } else {
            // Es estudiante
            if (estaSancionado) {
                JOptionPane.showMessageDialog(null, "Acceso denegado. El usuario ha sido sancionado.");
            } else if (!correoOk) {
                JOptionPane.showMessageDialog(null, "Acceso denegado. El correo electrónico no ha sido confirmado.");
            } else {
                JOptionPane.showMessageDialog(null, "Acceso concedido. Bienvenido, Estudiante.");
            }
        }
    }
}
