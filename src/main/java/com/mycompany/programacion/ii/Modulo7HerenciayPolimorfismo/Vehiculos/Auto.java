/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.Vehiculos;

/**
 *
 * @author juanp
 */
class Auto extends Vehiculo {
    private int cantidadPuertas;
    
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);           // Llama al constructor de Vehiculo y lo hereda
        this.cantidadPuertas = cantidadPuertas; // constructor atributo de Auto
    }

    @Override
    public String mostrarInfo() {
        
        // Reutiliza el metodo de vehiculo mostrarinfo y suma la cantidad de puertas de la subclase 
        
        return super.mostrarInfo() + " | Puertas: " + cantidadPuertas;
    }
}