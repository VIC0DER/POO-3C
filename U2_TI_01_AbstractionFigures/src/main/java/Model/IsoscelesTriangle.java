package Model;

public class IsoscelesTriangle extends Figures{
    private double base;
    private double side;
    private double height;

    public IsoscelesTriangle(double base, double side, double height) {
        this.base = base;
        this.side = side;
        this.height = height;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
    @Override
    public double getPerimeter() {
        return 2 * side + base;
    }
}
