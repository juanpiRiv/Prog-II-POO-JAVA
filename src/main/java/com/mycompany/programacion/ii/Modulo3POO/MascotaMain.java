/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo3POO;

/**
 *
 * @author juanp
 */
public class MascotaMain {
    
    public static void main(String[] args) {
        // Crear una mascota
        Mascota mascota1 = new Mascota("Firulais", "Perro", 3);

        // Mostrar
        mascota1.mostrarInfo();

        // Cumplir años
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
    }
}
