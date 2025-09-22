/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo6Colecciones.Universidad;

/**
 *
 * @author juanp
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // puede ser null si no se asigna

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) {
        // quir este curso de su profesor actual (si lo hay)
        if (this.profesor != null && this.profesor != p) {
            this.profesor.getCursos().remove(this);
        }
        // Asignar el nuevo profesor
        this.profesor = p;
        // Agregar este curso a la lista del nuevo profesor
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        String profName = (profesor != null) ? profesor.getNombre() : "Sin profesor";
        System.out.println("Curso: " + nombre +
                " (Código: " + codigo +
                ", Profesor: " + profName + ")");
    }
}
