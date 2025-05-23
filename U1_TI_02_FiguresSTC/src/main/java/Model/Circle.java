package Model;

public class Circle {
    private double radius;

    //Metodo para inicializar radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //Metodo para obtener el valor de radio
    public double getRadius() {
        return radius;
    }
    //Metodo para calcular el valor del perimetro del circulo
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    //Metodo para calcular el area del circulo
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
