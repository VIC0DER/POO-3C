package Model;

public class Computadora {
    private String brand = "HP";
    private String model;
    private boolean turnedOn = false;

    public void turnOn(){
        if(!turnedOn){
            System.out.println("Encendiendo...");
            turnedOn = true;
        }
    }
    public void turnOff(){
        if(turnedOn){
            System.out.println("Apagando...");
            turnedOn = false;
        }
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public boolean getStatus() {
        return turnedOn;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
