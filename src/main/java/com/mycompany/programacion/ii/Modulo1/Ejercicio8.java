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
public class Ejercicio8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //  División con enteros
            System.out.println("División con números enteros:");
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            if (num2 != 0) {
                int resultado = num1 / num2;
                System.out.println("Resultado con enteros: " + num1 + " / " + num2 + " = " + resultado);
            } else {
                System.out.println("Error: No se puede dividir por cero");
            }

            System.out.println();

            // División con double
            System.out.println("División con números decimales:");
            System.out.print("Ingrese el primer número decimal: ");
            double decimal1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número decimal: ");
            double decimal2 = scanner.nextDouble();

            if (decimal2 != 0) {
                double resultadoDecimal = decimal1 / decimal2;
                System.out.println("Resultado con decimales: " + decimal1 + " / " + decimal2 + " = " + resultadoDecimal);
            } else {
                System.out.println("Error: No se puede dividir por cero");
            }

            // Comparación
            System.out.println();
            System.out.println("Comparación usando los mismos números:");
            if (num2 != 0) {
                double conversion = (double) num1 / num2;
                System.out.println("División entera: " + (num1 / num2));
                System.out.println("División convertida a double: " + conversion);
                System.out.println("Diferencia: La división entera elimina los decimales");
            }

            scanner.close();
        }
    }