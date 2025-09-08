/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio1;

/**
 *
 * @author juanp
 */
class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // Composición - la foto depende del pasaporte
    private Titular titular; // Asociación bidireccional
    
    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto); // Composición
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null) {
            titular.setPasaporte(this); // Bidireccional
        }
    }
    
    // Getters y Setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(String fechaEmision) { this.fechaEmision = fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }
}