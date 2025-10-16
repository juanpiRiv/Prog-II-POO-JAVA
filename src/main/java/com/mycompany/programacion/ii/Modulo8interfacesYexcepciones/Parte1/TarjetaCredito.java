/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo8interfacesYexcepciones.Parte1;

/**
 *
 * @author juanp
 */
public class TarjetaCredito implements PagoConDescuento {
    private final String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% de descuento
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con Tarjeta de " + titular + " por $" + String.format("%.2f", monto));
    }
}
