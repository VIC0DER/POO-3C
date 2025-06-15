package Model;

public class Curso {
    private String codigo;
    private String nombre;
    private Estudiante[] inscritos;

    public Curso(String codigo, String nombre, int capacidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.inscritos = new Estudiante[capacidad];
    }
    public boolean inscribir(Estudiante e){
        for(int i = 0; i < inscritos.length; i++){
            if(inscritos[i] == null && e != null){
                inscritos[i] = new Estudiante(e.getNombre(), e.getEmail(), e.getPromedio());
                return true;
            }
        }
        return false;
    }
    public double calcularPromedioGrupo(){
        int cantidadInscritos = 0;
        double suma = 0;
        for(Estudiante e : inscritos){
            if(e != null){
                cantidadInscritos++;
                suma += e.getPromedio();
            }
        }
        return suma / cantidadInscritos;
    }
}
