/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio4;

/**
 *
 * @author juanp
 */
class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // Asociación bidireccional
    private Banco banco; // Agregación
    
    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null) {
            cliente.setTarjetaDeCredito(this); // Bidireccional
        }
    }
    
    public void setBanco(Banco banco) {
        this.banco = banco; // Agregación
    }
    
    // Getters y Setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(String fechaVencimiento) { 
        this.fechaVencimiento = fechaVencimiento; 
    }
    public Cliente getCliente() { return cliente; }
    public Banco getBanco() { return banco; }
}