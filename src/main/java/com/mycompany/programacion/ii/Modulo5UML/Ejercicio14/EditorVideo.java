/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio14;

/**
 *
 * @author juanp
 */
class EditorVideo {
    // Dependencia de creación - crea Render dentro del método pero no lo conserva
    public void exportar(String formato, Proyecto proyecto) {
        if (formato != null && !formato.isEmpty() && proyecto != null) {
            System.out.println("Preparando exportación...");
            
            // Crear el render (dependencia de creación)
            Render render = new Render(formato);
            render.setProyecto(proyecto);
            
            // Validar formato
            if (esFormatoValido(formato)) {
                render.iniciarRender();
                System.out.println("Archivo exportado como: " + proyecto.getNombre() + "." + formato.toLowerCase());
            } else {
                System.out.println("Error: Formato no soportado - " + formato);
            }
            
            // El objeto Render no se conserva como atributo de la clase
            // Se pierde cuando termina el método (dependencia de creación)
        } else {
            System.out.println("Error: Formato o proyecto inválido");
        }
    }
    
    private boolean esFormatoValido(String formato) {
        String[] formatosValidos = {"MP4", "AVI", "MOV", "WMV", "FLV"};
        for (String f : formatosValidos) {
            if (f.equalsIgnoreCase(formato)) {
                return true;
            }
        }
        return false;
    }
    
    public void exportarMultiplesFormatos(String[] formatos, Proyecto proyecto) {
        if (formatos != null && proyecto != null) {
            for (String formato : formatos) {
                exportar(formato, proyecto);
                System.out.println("---");
            }
        }
    }
}