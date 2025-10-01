/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.Vehiculos;

/**
 *
 * @author juanp
 */
public class MainVehiculos {
    public static void main(String[] args) {
        Auto a = new Auto("Toyota", "Corolla", 4);
        System.out.println(a.mostrarInfo());
        //polimorfismo
        Vehiculo v = new Auto("Ford", "Fiesta", 5); // upcasting
        System.out.println(v.mostrarInfo());        // llama al auto dinamicamente
    }
}