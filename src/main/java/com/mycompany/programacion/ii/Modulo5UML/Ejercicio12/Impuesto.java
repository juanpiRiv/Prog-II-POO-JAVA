/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio12;

/**
 *
 * @author juanp
 */
class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // Asociación unidireccional
    
    public Impuesto(double monto) {
        this.monto = monto;
    }
    
    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente; // Unidireccional
    }
    
    // Getters y Setters
    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }
    public Contribuyente getContribuyente() { return contribuyente; }
}