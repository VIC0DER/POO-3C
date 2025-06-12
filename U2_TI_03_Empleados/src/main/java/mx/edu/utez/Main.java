package mx.edu.utez;

import Model.Empleado;
import Model.EmpleadoPorHoras;
import Model.EmpleadoTiempoCompleto;

public class Main {
    public static void main(String[] args) {
        Empleado empleadoTiempoCompleto = new EmpleadoTiempoCompleto("A1", "Juan", 100, "Todas las prestaciones de ley");
        Empleado empleadoPorHoras = new EmpleadoPorHoras("B2", "Pedro", 100, 30);
        Empleado[] empleados = {empleadoTiempoCompleto, empleadoPorHoras};
        for (Empleado empleado : empleados) {
            System.out.println("---------------------------------------------------");
            System.out.println(empleado.getClass().getSimpleName());
            System.out.println("Salario: "+empleado.calcularSalario());
        }

    }
}