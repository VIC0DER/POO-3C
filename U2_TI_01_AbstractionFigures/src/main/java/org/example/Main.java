package org.example;

import Model.*;

public class Main {
    public static void main(String[] args) {
        Figures sq = new Square(5);
        Figures cir = new Circle(4);
        Figures iscTrg = new IsoscelesTriangle(3, 4, 5);
        Figures eqTrg = new EquilateralTriangle(10);
        Figures rightTrg = new RightTriangle(3, 4);
        Figures[] figures = {sq, cir, iscTrg, eqTrg, rightTrg};
        for (Figures figure : figures) {
            System.out.println("-------------------------");
            System.out.println("Clase: " + figure.getClass().getSimpleName());
            System.out.println("Area: " + figure.getArea());
            System.out.println("Perimetro: " + figure.getPerimeter());
        }

    }
}