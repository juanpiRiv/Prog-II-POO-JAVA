/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo3POO;

/**
 *
 * @author juanp
 */
public class MainLibro {
    public static void main(String[] args) {
        //Creamos un libro
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);

        //Mostramos su informacion
        libro1.mostrarInfo();

        //Intentamos modificar con un año invalido
        libro1.setAnioPublicacion(-100);
        libro1.mostrarInfo();

        // Modificamos con un año válido
        libro1.setAnioPublicacion(1982);
        libro1.mostrarInfo();
    }
}
