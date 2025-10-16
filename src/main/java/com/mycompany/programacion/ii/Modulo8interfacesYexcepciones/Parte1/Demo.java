/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo8interfacesYexcepciones.Parte1;

/**
 *
 * @author juanp
 */
public class Demo {
   public static void main(String[] args) {
        // 1) Cliente
        Cliente cliente = new Cliente("Juan Pablo");

        // 2) Pedido y productos
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Mouse", 15_000));
        pedido.agregarProducto(new Producto("Teclado", 25_000));
        pedido.agregarProducto(new Producto("Auriculares", 18_500));

        double total = pedido.calcularTotal();
        System.out.println("Total sin descuentos: $" + String.format("%.2f", total));

        // 3) Elegimos medio de pago: Tarjeta con descuento
        Pago medioPago = new TarjetaCredito("Juan Pablo Rivero A.");

        double aPagar = total;
        if (medioPago instanceof PagoConDescuento) {
            aPagar = ((PagoConDescuento) medioPago).aplicarDescuento(total);
            System.out.println("Total con descuento:  $" + String.format("%.2f", aPagar));
        }

        // 4) Procesamos el pago y cambiamos estado (se notifica al cliente)
        medioPago.procesarPago(aPagar);
        pedido.cambiarEstado(EstadoPedido.PAGADO);

        // 5) Continuamos el flujo normal
        pedido.cambiarEstado(EstadoPedido.ENVIADO);
        pedido.cambiarEstado(EstadoPedido.ENTREGADO);
    } 
}
