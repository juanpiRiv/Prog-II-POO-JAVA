/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo3POO;

/**
 *
 * @author juanp
 */
public class Gallina {
    //Atributos
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    //cnst
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; // al inicio no puso huevos
    }

    // poner huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println(" La gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    //  envejecer
    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + " cumplió un año más. Edad: " + edad);
    }

    // mostrar estado
    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " | Edad: " + edad + " años | Huevos puestos: " + huevosPuestos);
    }
}
