/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.FigurasAbstractas;

/**
 *
 * @author juanp
 */
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstract hace que  cada subclase pueda y lo implemente a su manera
    public abstract double calcularArea();
    //Cadena
    @Override
    public String toString() {
        return nombre + " (área=" + calcularArea() + ")";
    }
}
