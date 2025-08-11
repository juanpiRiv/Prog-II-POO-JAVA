/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo2;

/**
 *
 * @author juanp
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        // Declarar e inicializar array con precios de productos
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // Mostrar valores originales
        System.out.println("Precios originales:");
        mostrarPrecios(precios);
        
        // Modificar el precio del producto en índice 2 (149.75 -> 129.99)
        precios[2] = 129.99;
        
        // Mostrar valores modificados
        System.out.println("\nPrecios modificados:");
        mostrarPrecios(precios);
    }
    
    // para mostrar los precios 
    public static void mostrarPrecios(double[] precios) {
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}