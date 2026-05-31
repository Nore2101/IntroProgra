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

public class Ejercicio9 {
    public static void main(String[] args) {
        String categoria = JOptionPane.showInputDialog("Seleccione la categoría del nadador:\n1. Principiante\n2. Intermedio\n3. Avanzado");
        String entrenamientos;

        switch (categoria) {
            case "1":
                entrenamientos = "Categoría: Principiante\n- Calentamiento básico\n- Ejercicios de flotación\n- Estilo libre suave";
                break;
            case "2":
                entrenamientos = "Categoría: Intermedio\n- Calentamiento avanzado\n- Técnica de espalda\n- Ejercicios de resistencia";
                break;
            case "3":
                entrenamientos = "Categoría: Avanzado\n- Calentamiento intensivo\n- Técnica de mariposa\n- Nado de velocidad\n- Ejercicios de alta resistencia";
                break;
            default:
                entrenamientos = "Opción no válida. Por favor ingrese 1, 2 o 3.";
        }

        JOptionPane.showMessageDialog(null, entrenamientos);
    }
}
