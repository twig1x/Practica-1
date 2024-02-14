/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author rodri
 */

public class Main {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese su cédula: ");
            String cedula = scanner.nextLine();

            System.out.print("Ingrese la cantidad de dinero que tiene: ");
            double dineroTotal = Double.parseDouble(scanner.nextLine());

            Usuario usuario = new Usuario();
            usuario.nombre = nombre;
            usuario.cedula = cedula;
            usuario.dineroTotal = dineroTotal;

            // Crear vehículos
            Caballo caballo = new Caballo();
            caballo.marca = "Caballo";
            caballo.year = 2020;
            caballo.raza = "Pura Sangre";
            caballo.edad = 5;
            caballo.nivelHambre = 3;
            caballo.precio = 500;

            Automovil automovil = new Automovil();
            automovil.marca = "Toyota";
            automovil.year = 2022;
            automovil.modelo = "Camry";
            automovil.motorSize = 2.5;
            automovil.precio = 2000;

            Avion avion = new Avion();
            avion.marca = "Boeing";
            avion.year = 2021;
            avion.size = "Grande";
            avion.numMotores = 4;
            avion.precio = 50000;

            // Solicitar al usuario que elija un vehículo
            System.out.println("\nVehículos disponibles:");
            System.out.println("a. Caballo - $500");
            System.out.println("b. Automóvil - $2000");
            System.out.println("c. Avión - $50000");

            System.out.print("Ingrese la opción que desea (a, b, c): ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "a":
                    usuario.comprarVehiculo(caballo);
                    break;
                case "b":
                    usuario.comprarVehiculo(automovil);
                    break;
                case "c":
                    usuario.comprarVehiculo(avion);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            System.out.println("\nInformación del usuario:");
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Cédula: " + usuario.cedula);
            System.out.println("Dinero total: $" + String.format("%.2f", usuario.dineroTotal));
            if (usuario.vehiculo != null) {
                System.out.println("Vehículo actual: " + usuario.vehiculo.getClass().getSimpleName());
            } else {
                System.out.println("No tienes un vehículo.");
            }

            usuario.manejar();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
