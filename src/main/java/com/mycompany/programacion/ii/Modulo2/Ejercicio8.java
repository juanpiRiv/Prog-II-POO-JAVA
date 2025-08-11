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

public class Ejercicio8 {
    // precio base
    static double precioBase;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = scanner.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble() / 100; // Convertir a decimal
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble() / 100; // Convertir a decimal
        
        double precioFinal = calcularPrecioFinal(impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
        
        scanner.close();
    }
    
    public static double calcularPrecioFinal(double impuesto, double descuento) {
        // PrecioFinal = PrecioBase + (PrecioBase × Impuesto) - (PrecioBase × Descuento)
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
}