/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio14;

/**
 *
 * @author juanp
 */
class Render {
    private String formato;
    private Proyecto proyecto; // Asociación unidireccional
    
    public Render(String formato) {
        this.formato = formato;
    }
    
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto; // Unidireccional
    }
    
    // Getters y Setters
    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }
    public Proyecto getProyecto() { return proyecto; }
    
    public void iniciarRender() {
        if (proyecto != null) {
            System.out.println("=== INICIANDO RENDER ===");
            System.out.println("Proyecto: " + proyecto.getNombre());
            System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
            System.out.println("Formato: " + formato);
            System.out.println("Progreso del render...");
            
            // Simular tiempo de renderizado
            for (int i = 20; i <= 100; i += 20) {
                System.out.println(i + "% completado");
            }
            System.out.println("Render completado exitosamente");
        }
    }
}