/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.Animales;

/**
 *
 * @author juanp
 */
public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Guau";
    }
}


