/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo1;

/**
 *
 * @author juanp
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Hola! Vamos a hacer algunas operaciones matemáticas");

        System.out.print("Dame el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ahora dame el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("\n¡Perfecto! Con " + numero1 + " y " + numero2 + " puedo hacer esto:");
        System.out.println("─────────────────────────────────────");

        // Las operaciones
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;

        System.out.println("Si los sumo: " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("Si los resto: " + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("Si los multiplico: " + numero1 + " x " + numero2 + " = " + multiplicacion);

        // División
        if (numero2 == 0) {
            System.out.println("Para la división... ¡Ups! No puedo dividir por cero ");
        } else {
            double division = (double) numero1 / numero2;
            System.out.println("Si los divido: " + numero1 + " ÷ " + numero2 + " = " + division);
        }

        scanner.close();
    }
}