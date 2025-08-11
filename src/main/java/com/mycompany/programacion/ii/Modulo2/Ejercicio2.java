/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo2;

import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class Ejercicio2 {
    
    // Determinar el Mayor de Tres Números
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        
        int mayor;
        
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }
        
        System.out.println("El mayor es: " + mayor);
    }
    
    // MAIN 
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 2: Determinar el Mayor de Tres Números ===");
        ejecutar();
    }
}