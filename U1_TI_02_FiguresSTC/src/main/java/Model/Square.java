package Model;

public class Square {
    private double side;
    private String message;
    //Metodo para inicializar lado (side)
    public void setSide(double side) {
        this.side = side;
    }
    //Metodo para obtener el valor de lado (side)
    public double getSide() {
        return side;
    }
    //Metodo para inicializar message
    public void setMessage(String message) {
        this.message = message;
    }
    //Metodo para calcular el valor del perimetro del cuadrado
    public double getPerimeter() {
        return side*4;
    }
    //Metodo para calcular el area del cuadrado
    public double getArea() {
        if(!this.message.isEmpty()){
            getSecretMessage();
        }
        return side*side;
    }
    private void getSecretMessage(){
        System.out.println("Este metodo solo es accesible dentro de la clase, pero no desde afuera");
    }
}
