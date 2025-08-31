/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo3POO;

/**
 *
 * @author juanp
 */
public class NaveEspacial {
    //atributos
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100; // Límite de capacidad
    // cntrs
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial > MAX_COMBUSTIBLE) {
            this.combustible = MAX_COMBUSTIBLE;
        } else {
            this.combustible = combustibleInicial;
        }
    }
    // despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado  (usó 10 de combustible).");
        } else {
            System.out.println("️ No hay suficiente combustible para despegar.");
        }
    }
    // avanzar
    public void avanzar(int distancia) {
        int consumo = distancia / 2; // 1 unidad de combustible cada 2 km
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km (consumió " + consumo + " de combustible).");
        } else {
            System.out.println("️No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }
    //recargar
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("El tanque está lleno (máximo " + MAX_COMBUSTIBLE + ").");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        }
    }
    //mostrar estado
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible disponible: " + combustible);
        System.out.println("------------------------------");
    }
}
