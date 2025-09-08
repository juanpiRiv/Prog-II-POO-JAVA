/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio10;

/**
 *
 * @author juanp
 */
class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // Composición - la clave depende de la cuenta
    private Titular titular; // Asociación bidireccional
    
    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaClave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigoClave, fechaClave); // Composición
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null) {
            titular.setCuentaBancaria(this); // Bidireccional
        }
    }
    
    // Getters y Setters
    public String getCbu() { return cbu; }
    public void setCbu(String cbu) { this.cbu = cbu; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public ClaveSeguridad getClaveSeguridad() { return claveSeguridad; }
    public Titular getTitular() { return titular; }
}