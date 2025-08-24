/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo3POO;

/**
 *
 * @author juanp
 */
public class Mascota {
    // Atributos
    private String nombre;
    private String especie;
    private int edad;

    // Cstr
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    //para mostrar la información de la mascota
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("------------------------------");
    }

    //para cumplir años (envejecer)
    public void cumplirAnios() {
        this.edad++;
        System.out.println(nombre + " ha cumplido un año más 🎉");
    }
}
