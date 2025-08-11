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


public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        
        scanner.nextLine(); 
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envío es: " + costoEnvio);
        
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
        
        scanner.close();
    }
    
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5; // 5 por kg
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10; // 10 por kg
        } else {
            System.out.println("Zona no válida. Usando tarifa nacional.");
            return peso * 5;
        }
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}