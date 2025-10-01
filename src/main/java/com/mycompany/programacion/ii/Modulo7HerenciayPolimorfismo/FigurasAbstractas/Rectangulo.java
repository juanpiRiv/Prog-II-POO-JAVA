/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.FigurasAbstractas;

/**
 *
 * @author juanp
 */

// Atributos propios de rectangulo 
public class Rectangulo extends Figura {
    private double ancho;
    private double alto;
   
//construtor  con atributos propios y atributo heredado
    public Rectangulo(double ancho, double alto) {
        super("Rectángulo");
        this.ancho = ancho;
        this.alto = alto;
    }
//Metodo heredado
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}