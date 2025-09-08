/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo5UML.Ejercicio9;

/**
 *
 * @author juanp
 */
class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente; // Asociación unidireccional
    private Profesional profesional; // Asociación unidireccional
    
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente; // Unidireccional
    }
    
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional; // Unidireccional
    }
    
    // Getters y Setters
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }
}