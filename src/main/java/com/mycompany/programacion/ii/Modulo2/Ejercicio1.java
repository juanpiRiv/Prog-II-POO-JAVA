/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo2;

import java.util.Scanner;

public class Ejercicio1 {
    
    // Verificación de Año Bisiesto
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();
        
        // Un año es bisiesto si es divisible por 4, pero no por 100, 
        // salvo que sea divisible por 400
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
    }
    
    // MAIN 
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1: Verificación de Año Bisiesto ===");
        ejecutar();
    }
}