/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.Empleados;

/**
 *
 * @author juanp
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBasico;
    private double antiguedadPct; // ej:0.15 = 15%
    
//metodo heredado de empleado
    
    public EmpleadoPlanta(String nombre, double sueldoBasico, double antiguedadPct) {
        super(nombre);
        this.sueldoBasico = sueldoBasico;
        this.antiguedadPct = antiguedadPct;
    }
//metodo abs 
    @Override
    public double calcularSueldo() {
        return sueldoBasico * (1 + antiguedadPct);
    }
}
