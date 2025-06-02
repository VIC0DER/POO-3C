package Model;

public class RightTriangle extends Figures{
    private double base;
    private double height;
    private double hypotenuse;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.hypotenuse = Math.sqrt(base * base + height * height);
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }
    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
        if(base == 0 && height != 0) {
            this.base = Math.sqrt(hypotenuse * hypotenuse - height * height);
        }else if(height == 0 && base != 0) {
            this.height = Math.sqrt(hypotenuse * hypotenuse - base * base);
        }else{
            System.out.println("In order to calculate the area and perimeter, first you must set an actual value in one of the cathetus");
        }
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
    @Override
    public double getPerimeter() {
        return base + height + hypotenuse;
    }
}
