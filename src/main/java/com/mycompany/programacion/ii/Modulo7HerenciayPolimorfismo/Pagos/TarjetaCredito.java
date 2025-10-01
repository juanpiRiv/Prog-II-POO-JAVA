/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.Pagos;

/**
 *
 * @author juanp
 */

public class TarjetaCredito implements Pagable {
    private String numero;

    public TarjetaCredito(String numero) {
        this.numero = numero;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con Tarjeta de Crédito " + numero);
    }
}
