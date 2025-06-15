package Model;

public class Estudiante extends Persona{
    private double promedio;

    public Estudiante(String nombre, String email, double promedio) {
        super(nombre, email);
        this.promedio = promedio;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
