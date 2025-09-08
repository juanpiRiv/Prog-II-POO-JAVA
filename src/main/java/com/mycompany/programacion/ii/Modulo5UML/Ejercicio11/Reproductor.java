/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio11;

/**
 *
 * @author juanp
 */
class Reproductor {
    // Dependencia de uso - usa Cancion como parámetro pero no la almacena
    public void reproducir(Cancion cancion) {
        if (cancion != null) {
            System.out.println("Reproduciendo: " + cancion.getTitulo());
            if (cancion.getArtista() != null) {
                System.out.println("Artista: " + cancion.getArtista().getNombre());
                System.out.println("Género: " + cancion.getArtista().getGenero());
            }
        } else {
            System.out.println("No hay canción para reproducir");
        }
    }
    
    public void pausar() {
        System.out.println("Reproducción pausada");
    }
    
    public void detener() {
        System.out.println("Reproducción detenida");
    }
}