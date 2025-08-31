/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo4POO;

/**
 *
 * @author juanp
 */
public class TestEmpleado {
    public static void main(String[] args) {
        System.out.println("Sistema de empleados");
        System.out.println("Empleados al inicio: " + Empleado.mostrarTotalEmpleados());
        
        //empleados con todos los datos
        Empleado juan = new Empleado(1, "Juan Perez", "Programador", 60000);
        Empleado sofia = new Empleado(2, "Sofia Martinez", "Analista", 55000);
        
        System.out.println(juan);
        System.out.println(sofia);
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
        
        //prueba el otro constructor
        Empleado luis = new Empleado("Luis Garcia", "Tester");
        Empleado ana = new Empleado("Ana Rodriguez", "Diseñadora");
        
        System.out.println("\nNuevos empleados:");
        System.out.println(luis);
        System.out.println(ana);
        
        //aumentos
        System.out.println("\nDando aumentos...");
        System.out.println("Juan antes: " + juan.getSalario());
        juan.actualizarSalario(10.0); // 10%
        System.out.println("Juan después: " + juan.getSalario());
        
        sofia.actualizarSalario(5000); // aumento fijo
        System.out.println("Sofia nuevo salario: " + sofia.getSalario());
        
        //aumento a Luis 
        luis.actualizarSalario(7.5);
        
        System.out.println("\nTodos los empleados:");
        System.out.println(juan);
        System.out.println(sofia);  
        System.out.println(luis);
        System.out.println(ana);
        
        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
        //funciona el contador
        Empleado carlos = new Empleado("Carlos Lopez", "Gerente");
        System.out.println("Nuevo empleado: " + carlos);
        System.out.println("Total final: " + Empleado.mostrarTotalEmpleados());
    }
}