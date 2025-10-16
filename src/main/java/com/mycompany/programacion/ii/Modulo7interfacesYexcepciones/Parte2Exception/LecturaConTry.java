/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7interfacesYexcepciones.Parte2Exception;

/**
 *
 * @author juanp
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaConTry {
    public static void main(String[] args) {
        // try-with-resources cierra el recurso automáticamente
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
