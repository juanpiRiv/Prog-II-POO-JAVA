/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio11;

/**
 *
 * @author juanp
 */
class Cancion {
    private String titulo;
    private Artista artista; // Asociación unidireccional
    
    public Cancion(String titulo) {
        this.titulo = titulo;
    }
    
    public void setArtista(Artista artista) {
        this.artista = artista; // Unidireccional
    }
    
    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public Artista getArtista() { return artista; }
}
