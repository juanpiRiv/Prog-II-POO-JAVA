/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.FigurasAbstractas;

/**
 *
 * @author juanp
 */
public class Circulo extends Figura {
    private double radio;
//extendemos metodo junto a atributo nombre 
    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }
// formula pi * r²
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}