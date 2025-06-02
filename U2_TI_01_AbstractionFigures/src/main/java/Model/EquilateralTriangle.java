package Model;

public class EquilateralTriangle extends Figures{
    private double side;
    private double height;

    public EquilateralTriangle(double side, double height) {
        this.side = side;
        this.height = height;
    }
    //Constructor por si se desconoce la altura exacta
    public EquilateralTriangle(double side) {
        this.side = side;
        //Se calcula la altura de un triángulo equilátero usando el teorema de Pitágoras
        this.height = Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2));
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
        //Actualizamos la altura si se cambia el lado, ya que estamos tratando un triangulo equilatero
        this.height = Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2));
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (side * height) / 2;
    }
    @Override
    public double getPerimeter() {
        return 3 * side;
    }
}
