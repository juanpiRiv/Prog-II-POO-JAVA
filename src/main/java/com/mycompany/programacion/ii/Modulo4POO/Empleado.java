/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo4POO;

/**
 *
 * @author juanp
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // estático para contar empleados
    private static int totalEmpleados = 0;
    private static int siguienteId = 1; //IDs automaticos
    
    // Constr recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementar contador
        
        // Actualizar siguienteId si el id proporcionado es mayor
        if (id >= siguienteId) {
            siguienteId = id + 1;
        }
    }
    
    // Constructor que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = siguienteId++; // Asignar ID
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000.0; // Salario por defecto
        totalEmpleados++; // Incrementar contador 
    }
    
    //actualizarSalario - recibe porcentaje de aumento
    public void actualizarSalario(double porcentaje) {
        this.salario = this.salario * (1 + porcentaje / 100);
    }
    
    // actualizarSalario - recibe cantidad fija
    public void actualizarSalario(int aumentoFijo) {
        this.salario = this.salario + aumentoFijo;
    }
    
    //toString para representacion legible del objeto
    @Override
    public String toString() {
        return String.format("Empleado [ID: %d, Nombre: %s, Puesto: %s, Salario: $%.2f]", 
                           this.id, this.nombre, this.puesto, this.salario);
    }
    
    //mostrar el total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Getters y setters para encapsulamiento
    public int getId() {
        return this.id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
}