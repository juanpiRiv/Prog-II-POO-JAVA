/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.Animales;

/**
 *
 * @author juanp
 */
import java.util.*;

public class MainAnimales {
    public static void main(String[] args) {
        List<Animal> animales = Arrays.asList(
            new Perro("Toby"),
            new Gato("Mishi"),
            new Vaca("Lola")
        );

        for (Animal a : animales) {
            System.out.println(a.describirAnimal() + " → " + a.hacerSonido());
        }
    }
}

