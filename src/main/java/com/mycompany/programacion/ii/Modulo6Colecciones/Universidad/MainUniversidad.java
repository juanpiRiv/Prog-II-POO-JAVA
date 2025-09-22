/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo6Colecciones.Universidad;

/**
 *
 * @author juanp
 */
public class MainUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        // 1. Crear profesores
        Profesor p1 = new Profesor("P001", "Ana López", "Matemática");
        Profesor p2 = new Profesor("P002", "Carlos Pérez", "Programación");
        Profesor p3 = new Profesor("P003", "Lucía Gómez", "Física");

        // 2. Crear cursos
        Curso c1 = new Curso("C001", "Álgebra");
        Curso c2 = new Curso("C002", "POO en Java");
        Curso c3 = new Curso("C003", "Física I");
        Curso c4 = new Curso("C004", "Bases de Datos");
        Curso c5 = new Curso("C005", "Cálculo I");

        // 3. Agregar a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 4. Asignar profesores a cursos
        uni.asignarProfesorACurso("C001", "P001");
        uni.asignarProfesorACurso("C005", "P001");
        uni.asignarProfesorACurso("C002", "P002");
        uni.asignarProfesorACurso("C004", "P002");
        uni.asignarProfesorACurso("C003", "P003");

        System.out.println("Cursos y profesores:");
        uni.listarCursos();

        System.out.println("\nProfesores y sus cursos:");
        uni.listarProfesores();

        // 5. Cambiar profesor de un curso
        System.out.println("\nCambiando profesor de C004 a P003...");
        uni.asignarProfesorACurso("C004", "P003");

        System.out.println("\nCursos y profesores después del cambio:");
        uni.listarCursos();

        // 6. Eliminar un curso
        System.out.println("\nEliminando curso C005...");
        uni.eliminarCurso("C005");

        // 7. Eliminar un profesor
        System.out.println("\nEliminando profesor P001...");
        uni.eliminarProfesor("P001");

        System.out.println("\nProfesores y sus cursos finales:");
        uni.listarProfesores();

        // 8. Reporte final
        System.out.println("\nReporte final:");
        uni.reporteCantidadCursosPorProfesor();
    }
}
