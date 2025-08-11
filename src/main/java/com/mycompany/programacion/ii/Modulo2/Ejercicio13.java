/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo2;

/**
 *
 * @author juanp
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        // Declarar e inicializar array con precios de productos
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // Mostrar valores originales usando recursion
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);
        
        // Modificar el precio del producto en índice 2 (149.75 -> 129.99)
        precios[2] = 129.99;
        
        // Mostrar valores modificados usando recursión
        System.out.println("\nPrecios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }
    
    // Método recursivo para mostrar los precios
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        // si llegamos al final del array
        if (indice >= precios.length) {
            return;
        }
        
        // Mostrar el precio actual
        System.out.println("Precio: $" + precios[indice]);
        
        // Llamada recursiva para el siguiente 
        mostrarPreciosRecursivo(precios, indice + 1);
    }
}