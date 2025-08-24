/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo3POO;

/**
 *
 * @author juanp
 */
public class MainNaveEspacial {

    public static void main(String[] args) {
        // Crear una nave con 50 de combustible
        NaveEspacial nave1 = new NaveEspacial("Explorer-1", 50);

        // Mostrar estado inicial
        nave1.mostrarEstado();

        // Intentar avanzar sin recargar
        nave1.avanzar(200); // Esto debería fallar si no alcanza el combustible
        nave1.mostrarEstado();

        // Recargar combustible
        nave1.recargarCombustible(40);
        nave1.mostrarEstado();

        // Despegar y avanzar correctamente
        nave1.despegar();
        nave1.avanzar(60);
        nave1.mostrarEstado();
    }
}