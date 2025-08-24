/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo3POO;

/**
 *
 * @author juanp
 */
public class MainGallina {
    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina gallina1 = new Gallina(1, 2);
        Gallina gallina2 = new Gallina(2, 1);

        // Simular acciones
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();

        gallina2.ponerHuevo();
        gallina2.envejecer();

        // Mostrar estado final
        System.out.println("\n Estado final de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
