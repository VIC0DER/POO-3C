package org.example;

import Model.Computadora;

public class Main {
    public static void main(String[] args) {
        Computadora pc = new Computadora();
        pc.setModel("Victus");
        pc.turnOn();
        pc.turnOn();
        pc.turnOff();
        System.out.println("Marca: "+pc.getBrand());
        System.out.println("Modelo: "+pc.getModel());
        System.out.println("Encendida: "+(pc.getStatus()?"Si": "No"));
    }
}