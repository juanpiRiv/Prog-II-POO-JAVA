/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo8interfacesYexcepciones.Parte1;

/**
 *
 * @author juanp
 */
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private final Cliente cliente;
    private final List<Producto> productos = new ArrayList<>();
    private EstadoPedido estado = EstadoPedido.CREADO;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        notificar("Pedido creado con estado: " + estado);
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        notificar("Se agregó el producto: " + p.getNombre());
    }

    public void quitarProducto(Producto p) {
        if (productos.remove(p)) {
            notificar("Se quitó el producto: " + p.getNombre());
        }
    }

    @Override
    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::calcularTotal).sum();
    }

    public void cambiarEstado(EstadoPedido nuevo) {
        EstadoPedido anterior = this.estado;
        this.estado = nuevo;
        notificar("El estado del pedido cambió de " + anterior + " a " + nuevo);
    }

    public List<Producto> getProductos() { return new ArrayList<>(productos); }
    public EstadoPedido getEstado() { return estado; }
    public Cliente getCliente() { return cliente; }

    private void notificar(String mensaje) {
        if (cliente != null) {
            cliente.notificar(mensaje);
        }
    }
}
