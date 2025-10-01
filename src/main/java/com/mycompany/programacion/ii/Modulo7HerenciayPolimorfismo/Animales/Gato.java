/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.Animales;

/**
 *
 * @author juanp
 */
public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Miau";
    }
}