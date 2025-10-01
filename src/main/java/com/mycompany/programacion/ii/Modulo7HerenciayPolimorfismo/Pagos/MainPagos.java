/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.Pagos;

/**
 *
 * @author juanp
 */

public class MainPagos {
    public static void main(String[] args) {
        Pagable[] medios = {
            new TarjetaCredito("4111-****-****-1111"),
            new Transferencia("0000003100000001234567"),
            new Efectivo()
        };

        for (Pagable medio : medios) {
            ProcesadorPagos.procesarPago(medio, 12500);
        }
    }
}
