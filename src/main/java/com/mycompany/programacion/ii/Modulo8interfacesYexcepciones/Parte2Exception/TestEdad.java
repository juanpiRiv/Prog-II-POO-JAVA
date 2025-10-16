/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo8interfacesYexcepciones.Parte2Exception;

/**
 *
 * @author juanp
 */
public class TestEdad {
    public static void main(String[] args) {
        try {
            validarEdad(150); // probá con valores distintos
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad " + edad + " no es válida.");
        }
        System.out.println("Edad válida: " + edad);
    }
}

