/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7interfacesYexcepciones.Parte1;

/**
 *
 * @author juanp
 */
public class Cliente implements Notificable {
    private final String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("[Notificación a " + nombre + "]: " + mensaje);
    }

    public String getNombre() { return nombre; }
}

