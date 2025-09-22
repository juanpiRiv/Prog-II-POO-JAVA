/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo6Colecciones.Universidad;
import java.util.ArrayList;

/**
 *
 * @author juanp
 */

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public ArrayList<Curso> getCursos() { return cursos; }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            c.setProfesor(this); // sincroniza el otro lado
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            c.setProfesor(null); // quita la relacion
        }
    }

    public void listarCursos() {
        System.out.println("Cursos de " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println(" - " + c.getCodigo() + " : " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre +
                " (ID: " + id +
                ", Especialidad: " + especialidad +
                ", Cursos: " + cursos.size() + ")");
    }
}
