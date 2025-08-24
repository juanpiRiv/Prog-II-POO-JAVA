/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo3POO;
import java.util.Scanner;

public class EstudiantesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos datos al usuario
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese curso: ");
        String curso = sc.nextLine();
        System.out.print("Ingrese calificación inicial: ");
        double calificacion = sc.nextDouble();

        // Instanciamos el estudiante
        Estudiante estudiante1 = new Estudiante(nombre, apellido, curso, calificacion);

        // Mostramos su información
        estudiante1.mostrarInfo();

        // Probamos aumentar y disminuir calificación
        estudiante1.subirCalificacion(10);
        estudiante1.mostrarInfo();

        estudiante1.bajarCalificacion(20);
        estudiante1.mostrarInfo();

        sc.close();
    }
}