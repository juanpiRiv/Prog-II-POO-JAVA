/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio6;

/**
 *
 * @author juanp
 */
class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; // Asociación unidireccional
    private Mesa mesa; // Agregación
    
    public Reserva(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente; // Unidireccional - solo la reserva conoce al cliente
    }
    
    public void setMesa(Mesa mesa) {
        this.mesa = mesa; // Agregación
    }
    
    // Getters y Setters
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }
    public Cliente getCliente() { return cliente; }
    public Mesa getMesa() { return mesa; }
}
