/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion.ii.Modulo7HerenciayPolimorfismo.Empleados;

/**
 *
 * @author juanp
 */
import java.util.*;

public class MainEmpleado {
    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
            new EmpleadoPlanta("Ana", 500000, 0.15),   // Básico + 15% antiguedad
            new EmpleadoTemporal("Luis", 160, 2500), // 160 horas * $2500
            new EmpleadoPlanta("Marcos", 450000, 0.10) // Básico + 10% antiguedad
        );

        for (Empleado e : empleados) {
            System.out.println(e); // Polimorfico: invoca calcularSueldo() 

            // Clasificacion con instanceof
            if (e instanceof EmpleadoPlanta) {
                System.out.println("  Tipo: Planta permanente");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("  Tipo: Temporal");
            }
        }
    }
}

