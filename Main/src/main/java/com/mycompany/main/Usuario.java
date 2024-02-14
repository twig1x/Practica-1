/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author rodri
 */
class Usuario {
    String nombre;
    String cedula;
    double dineroTotal;
    Vehiculo vehiculo;

    void comprarVehiculo(Vehiculo vehiculo) {
        if (dineroTotal >= vehiculo.precio) {
            this.vehiculo = vehiculo;
            dineroTotal -= vehiculo.precio;
            System.out.println("¡Felicidades! Has podido comprar un " + vehiculo.getClass().getSimpleName() + ".");
        } else {
            System.out.println("No tienes el suficiente dinero para comprar este vehículo.");
        }
    }

    void manejar() {
        if (vehiculo != null) {
            System.out.println(nombre + " está manejando su " + vehiculo.getClass().getSimpleName() + ".");
            vehiculo.aumentarVelocidad();
            vehiculo.disminuirVelocidad();
            vehiculo.frenar();
            vehiculo.encenderAlarma();
        } else {
            System.out.println("Lo siento, no tienes un vehículo para manejar.");
        }
    }
}