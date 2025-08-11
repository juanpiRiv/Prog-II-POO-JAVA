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
public class Ejercicio4 {
   

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);
        
        double porcentajeDescuento = 0;
        
        if (categoria == 'A') {
            porcentajeDescuento = 0.10; // 10%
        } else if (categoria == 'B') {
            porcentajeDescuento = 0.15; // 15%
        } else if (categoria == 'C') {
            porcentajeDescuento = 0.20; // 20%
        } else {
            System.out.println("Categoría inválida. Use A, B o C.");
            return;
        }
        
        double descuentoAplicado = precio * porcentajeDescuento;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + (int)(porcentajeDescuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
    
    // MAIN
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 4: Calculadora de Descuento según categoría ===");
        ejecutar();
    }
}
  