/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.Vehiculos;

/**
 *
 * @author juanp
 */
public class Vehiculo {
    // Usamos protected para que las subclases puedan acceder directo.
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String mostrarInfo() {
        return "Vehículo: " + marca + " " + modelo;
    }
}
