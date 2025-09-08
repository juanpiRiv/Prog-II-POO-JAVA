/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio13;

/**
 *
 * @author juanp
 */
class GeneradorQR {
    // Dependencia de creación - crea CodigoQR dentro del método pero no lo conserva
    public void generar(String valor, Usuario usuario) {
        if (valor != null && !valor.isEmpty() && usuario != null) {
            // Crear el código QR (dependencia de creación)
            CodigoQR codigoQR = new CodigoQR(valor);
            codigoQR.setUsuario(usuario);
            
            // Simular la generación del QR
            System.out.println("Generando código QR...");
            codigoQR.mostrarInformacion();
            System.out.println("Código QR generado exitosamente");
            
            // El objeto CodigoQR no se conserva como atributo de la clase
            // Se pierde cuando termina el método (dependencia de creación)
        } else {
            System.out.println("Error: Valor o usuario inválido");
        }
    }
    
    public void generarMultiple(String[] valores, Usuario usuario) {
        if (valores != null && usuario != null) {
            for (String valor : valores) {
                generar(valor, usuario);
                System.out.println("---");
            }
        }
    }
}
