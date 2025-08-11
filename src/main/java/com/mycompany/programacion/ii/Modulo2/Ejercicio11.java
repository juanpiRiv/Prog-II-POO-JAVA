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


public class Ejercicio11 {
    // Variable para el descuento especial
    static final double DESCUENTO_ESPECIAL = 0.10; // 10%
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        calcularDescuentoEspecial(precio);
        
        scanner.close();
    }
    
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local para almacenar el descuento aplicado
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}