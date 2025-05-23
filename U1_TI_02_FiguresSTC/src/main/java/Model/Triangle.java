package Model;

public class Triangle {
    private double base;
    private double secondSide;
    private double thirdSide;
    private double height;

    //Constructor para asignar el valor a cada atributo
    public Triangle(double base, double secondSide, double thirdSide, double height) {
        this.base = base;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.height = height;
    }

    //Metodo para calcular el valor del perimetro del triangulo
    public double getPerimeter() {
        return base + secondSide + thirdSide;
    }
    //Metodo para calcular el area del triangulo
    public double getArea() {
        return base * height / 2;
    }
}
