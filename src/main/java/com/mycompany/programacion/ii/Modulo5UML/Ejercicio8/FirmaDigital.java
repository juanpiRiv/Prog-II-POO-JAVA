/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio8;

/**
 *
 * @author juanp
 */
class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario; // Agregación
    
    public FirmaDigital(String codigoHash, String fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario; // Agregación
    }
    
    // Getters y Setters
    public String getCodigoHash() { return codigoHash; }
    public void setCodigoHash(String codigoHash) { this.codigoHash = codigoHash; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public Usuario getUsuario() { return usuario; }
}