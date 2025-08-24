/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo3POO;

/**
 *
 * @author juanp
 */
// Clase Estudiante
public class Estudiante {
    // Atributos
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Csntr
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Metodo mostrar la información del estudiante
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println("--------------------------------");
    }

    // subir calificación
    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        System.out.println("Se aumentó la calificación en " + puntos + " puntos.");
    }

    // bajar calificación
    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        if (this.calificacion < 0) {
            this.calificacion = 0; // No permitir negativa
        }
        System.out.println("Se disminuyó la calificación en " + puntos + " puntos.");
    }
}
