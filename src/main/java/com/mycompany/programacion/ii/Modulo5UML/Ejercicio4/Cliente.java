/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio4;

/**
 *
 * @author juanp
 */
class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetaDeCredito; // Asociación bidireccional
    
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    public TarjetaDeCredito getTarjetaDeCredito() { return tarjetaDeCredito; }
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) { 
        this.tarjetaDeCredito = tarjetaDeCredito; 
    }
}
