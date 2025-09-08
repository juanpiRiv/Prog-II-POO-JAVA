/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio12;

/**
 *
 * @author juanp
 */
class Calculadora {
    // Dependencia de uso - usa Impuesto como parámetro pero no lo almacena
    public void calcular(Impuesto impuesto) {
        if (impuesto != null) {
            double montoBase = impuesto.getMonto();
            double interes = montoBase * 0.05; // 5% de interés
            double montoTotal = montoBase + interes;
            
            System.out.println("=== CÁLCULO DE IMPUESTO ===");
            if (impuesto.getContribuyente() != null) {
                System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
                System.out.println("CUIL: " + impuesto.getContribuyente().getCuil());
            }
            System.out.println("Monto base: $" + montoBase);
            System.out.println("Interés (5%): $" + interes);
            System.out.println("Monto total: $" + montoTotal);
        } else {
            System.out.println("No hay impuesto para calcular");
        }
    }
    
    public double calcularDescuento(Impuesto impuesto, double porcentajeDescuento) {
        if (impuesto != null) {
            return impuesto.getMonto() * (porcentajeDescuento / 100);
        }
        return 0;
    }
}