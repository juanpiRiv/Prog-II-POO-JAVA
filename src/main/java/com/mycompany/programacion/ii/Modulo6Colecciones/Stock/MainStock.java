/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo6Colecciones.Stock;

/**
 *
 * @author juanp
 */

public class MainStock {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear productos
        Producto p1 = new Producto("P001", "Arroz", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Celular", 85000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 3500, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla", 5000, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Pan", 500, 100, CategoriaProducto.ALIMENTOS);

        // 2. Agregar al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 3. Listar productos
        System.out.println("Listado de productos:");
        inventario.listarProductos();

        // 4. Buscar por ID
        System.out.println("\nBuscando producto P003:");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        // 5. Filtrar por categoría
        System.out.println("\nProductos de ALIMENTOS:");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // 6. Eliminar un producto
        inventario.eliminarProducto("P005");
        System.out.println("\nLista después de eliminar P005:");
        inventario.listarProductos();

        // 7. Actualizar stock
        inventario.actualizarStock("P001", 60);
        System.out.println("\nStock actualizado de P001:");
        inventario.buscarProductoPorId("P001").mostrarInfo();

        // 8. Total stock
        System.out.println("\nTotal de stock: " + inventario.obtenerTotalStock());

        // 9. Producto con mayor stock
        System.out.println("\nProducto con mayor stock:");
        inventario.obtenerProductoConMayorStock().mostrarInfo();

        // 10. Filtrar por precio
        System.out.println("\nProductos con precio entre $1000 y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 11. Categorías disponibles
        System.out.println("\nCategorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }
}
