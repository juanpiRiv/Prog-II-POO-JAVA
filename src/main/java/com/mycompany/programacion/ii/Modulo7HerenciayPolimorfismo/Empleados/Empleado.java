/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.Empleados;

/**
 *
 * @author juanp
 */
public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Metodo abstracto
    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return nombre + " → $" + calcularSueldo();
    }
}