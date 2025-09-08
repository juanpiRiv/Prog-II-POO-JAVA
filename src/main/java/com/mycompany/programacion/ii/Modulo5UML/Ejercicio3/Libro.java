/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio3;

/**
 *
 * @author juanp
 */
class Libro {
    private String titulo;
    private String isbn;
    private Autor autor; // Asociación unidireccional
    private Editorial editorial; // Agregación
    
    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor; // Unidireccional - solo el libro conoce al autor
    }
    
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial; // Agregación
    }
    
    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }
}