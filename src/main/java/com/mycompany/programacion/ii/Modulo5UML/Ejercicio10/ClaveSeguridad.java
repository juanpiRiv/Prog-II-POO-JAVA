/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio10;

/**
 *
 * @author juanp
 */
class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    
    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getUltimaModificacion() { return ultimaModificacion; }
    public void setUltimaModificacion(String ultimaModificacion) { 
        this.ultimaModificacion = ultimaModificacion; 
    }
}