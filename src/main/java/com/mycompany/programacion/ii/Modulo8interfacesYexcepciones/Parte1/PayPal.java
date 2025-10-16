/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo8interfacesYexcepciones.Parte1;

/**
 *
 * @author juanp
 */
public class PayPal implements Pago {
    private final String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal (" + email + ") por $" + String.format("%.2f", monto));
    }
}

