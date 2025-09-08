/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio13;

/**
 *
 * @author juanp
 */
class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociación unidireccional
    
    public CodigoQR(String valor) {
        this.valor = valor;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario; // Unidireccional
    }
    
    // Getters y Setters
    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }
    public Usuario getUsuario() { return usuario; }
    
    public void mostrarInformacion() {
        System.out.println("=== CÓDIGO QR ===");
        System.out.println("Valor: " + valor);
        if (usuario != null) {
            System.out.println("Usuario: " + usuario.getNombre());
            System.out.println("Email: " + usuario.getEmail());
        }
    }
}
