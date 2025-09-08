/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio8;

/**
 *
 * @author juanp
 */
class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // Composición - la firma depende del documento
    
    public Documento(String titulo, String contenido, String codigoHash, String fechaFirma) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fechaFirma); // Composición
    }
    
    public void asignarUsuarioAFirma(Usuario usuario) {
        if (this.firmaDigital != null) {
            this.firmaDigital.setUsuario(usuario);
        }
    }
    
    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }
    public FirmaDigital getFirmaDigital() { return firmaDigital; }
}
