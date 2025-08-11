/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo2;

/**
 *
 * @author juanp
 */
import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class Ejercicio3 {
    
    // Clasificación de Edad
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        String categoria;
        
        if (edad < 12) {
            categoria = "Niño";
        } else if (edad >= 12 && edad <= 17) {
            categoria = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            categoria = "Adulto";
        } else { // edad >= 60
            categoria = "Adulto mayor";
        }
        
        System.out.println("Eres un " + categoria + ".");
    }
    
    // MAIN 
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 3: Clasificación de Edad ===");
        ejecutar();
    }
}