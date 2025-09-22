/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo6Colecciones.Biblioteca;

/**
 *
 * @author juanp
 */
public class MainBiblioteca {
    public static void main(String[] args) {
        // 1. Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear autores
        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("A003", "Julio Verne", "Francés");

        // 3. Agregar libros
        biblioteca.agregarLibro("L001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("L002", "Harry Potter y la piedra filosofal", 1997, a2);
        biblioteca.agregarLibro("L003", "Harry Potter y la cámara secreta", 1998, a2);
        biblioteca.agregarLibro("L004", "Viaje al centro de la Tierra", 1864, a3);
        biblioteca.agregarLibro("L005", "La vuelta al mundo en 80 días", 1873, a3);

        // 4. Listar libros
        System.out.println("Listado de libros:");
        biblioteca.listarLibros();

        // 5. Buscar libro por ISBN
        System.out.println("\nBuscando libro L002:");
        Libro buscado = biblioteca.buscarLibroPorIsbn("L002");
        if (buscado != null) buscado.mostrarInfo();

        // 6. Filtrar libros por año
        System.out.println("\nLibros publicados en 1997:");
        biblioteca.filtrarLibrosPorAnio(1997);

        // 7. Eliminar libro
        biblioteca.eliminarLibro("L005");
        System.out.println("\nLista después de eliminar L005:");
        biblioteca.listarLibros();

        // 8. Cantidad total de libros
        System.out.println("\nCantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar autores disponibles
        System.out.println("\nAutores disponibles:");
        biblioteca.mostrarAutoresDisponibles();
    }
}