package org.example;

import Model.Circle;
import Model.Square;
import Model.Triangle;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //Instancia a una clase para limitar la cantidad de decimales
        DecimalFormat df = new DecimalFormat("#.##");
        //Instancia a las clases de las figuras
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle(5, 10, 10, 9.68);
        //Inicializar los atributos de cuadrado
        square.setSide(10);
        square.setMessage("");
        //Inicializar los atributos de circulo
        circle.setRadius(8);

        System.out.println("Perimetro del cuadrado: "+square.getPerimeter());
        System.out.println("Area del cuadrado: "+square.getArea());
        System.out.println("Perimetro del circulo: "+df.format(circle.getPerimeter()));
        System.out.println("Area del circulo: "+df.format(circle.getArea()));
        System.out.println("Perimetro del triangulo isosceles: "+triangle.getPerimeter());
        System.out.println("Area del del triangulo isosceles: "+triangle.getArea());
    }
}