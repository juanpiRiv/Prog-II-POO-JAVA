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

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre al usuario
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar la edad al usuario
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Mostrar los datos ingresados en pantalla
        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");

        // Cerrar el scanner (buena práctica)
        scanner.close();
    }
}