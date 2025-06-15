package org.example;

import Model.*;

public class Main {
    public static void main(String[] args) {
        Curso poo = new Curso("A1", "POO", 3);
        Estudiante e1 = new Estudiante("Juan", "20243ds01@utez.edu.mx", 10);
        Estudiante e2 = new Estudiante("Alberto", "20243ds02@utez.edu.mx", 9);
        Estudiante e3 = new Estudiante("Oscar", "20243ds03@utez.edu.mx", 8);

        poo.inscribir(e1);
        poo.inscribir(e2);
        poo.inscribir(e3);

        System.out.println("Promedio grupal: "+poo.calcularPromedioGrupo());
    }
}