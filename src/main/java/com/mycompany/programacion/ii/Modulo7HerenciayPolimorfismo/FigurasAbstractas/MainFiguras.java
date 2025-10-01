/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.FigurasAbstractas;

/**
 *
 * @author juanp
 */
public class MainFiguras {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(3),       // radio = 3
            new Rectangulo(4, 2), // ancho = 4, alto = 2
            new Circulo(5)        // radio = 5
        };

        for (Figura f : figuras) {
            System.out.println(f);  // Llama a toString() → muestra nombre y área
        }
    }
}

