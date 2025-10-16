/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7interfacesYexcepciones.Parte2Exception;

/**
 *
 * @author juanp
 */
import java.io.*;

// Para File, FileReader, BufferedReader, IOException, etc.
import java.util.Scanner;

public class Demo {

    // ========== MAIN ==========
    public static void main(String[] args) {
        System.out.println("=== 1) División Segura ===");
        divisionSegura(10, 2);   // OK
        divisionSegura(5, 0);    // Error

        System.out.println("\n=== 2) Conversión de cadena a número ===");
        conversionNumero("123"); // OK
        conversionNumero("abc"); // Error

        System.out.println("\n=== 3) Lectura de archivo ===");
        lecturaArchivo("datos.txt"); // Probá con archivo existente y con nombre inventado

        System.out.println("\n=== 4) Excepción personalizada ===");
        try {
            validarEdad(25);   // OK
            validarEdad(150);  // Error
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== 5) Try-with-resources ===");
        lecturaConTry("datos.txt");
    }

    // ---------- Ejercicio 1 ----------
    public static void divisionSegura(int a, int b) {
        try {
            int resultado = a / b;
            System.out.println(a + " / " + b + " = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        }
    }

    // ---------- Ejercicio 2 ----------
    public static void conversionNumero(String texto) {
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Cadena convertida: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: \"" + texto + "\" no es un número válido.");
        }
    }

    // ---------- Ejercicio 3 ----------
    public static void lecturaArchivo(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo \"" + nombreArchivo + "\" no existe.");
        }
    }

    // ---------- Ejercicio 4 ----------
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad " + edad + " no es válida.");
        }
        System.out.println("Edad válida: " + edad);
    }

    // Clase interna para la excepción personalizada
    public static class EdadInvalidaException extends Exception {
        public EdadInvalidaException(String mensaje) {
            super(mensaje);
        }
    }

    // ---------- Ejercicio 5 ----------
    public static void lecturaConTry(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

