/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.Pagos;

/**
 *
 * @author juanp
 */
public class ProcesadorPagos {
    public static void procesarPago(Pagable medio, double monto) {
        medio.pagar(monto); //ejecuta el método real según el objeto
    }
}
