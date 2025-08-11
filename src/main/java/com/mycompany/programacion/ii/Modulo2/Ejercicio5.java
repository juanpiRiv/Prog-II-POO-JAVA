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
public class Ejercicio5 {
    
    // Suma de Números Pares (while)
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int sumaPares = 0;
        
        System.out.println("Ingrese números (0 para terminar):");
        
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
            
            // Si el numero no es 0 y es par lo sumamos
            if (numero != 0 && numero % 2 == 0) {
                sumaPares += numero;
            }
        } while (numero != 0);
        
        System.out.println("La suma de los números pares es: " + sumaPares);
    }
    
    // MAIN 
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 5: Suma de Números Pares (while) ===");
        ejecutar();
    }
}