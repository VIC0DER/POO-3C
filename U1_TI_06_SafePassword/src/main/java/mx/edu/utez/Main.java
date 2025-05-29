package mx.edu.utez;

import Model.SafeUser;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Ingresa usuario: ");
        String password = JOptionPane.showInputDialog("Ingresa contrasena");
        String loginUser;
        String loginPassword;
        SafeUser user = new SafeUser();
        user.setUsername(username);
        user.setPassword(password);
        if(!user.getPassword().isEmpty() && !user.getUsername().isEmpty()) {
            System.out.println("Registro de usuario exitoso");
            loginUser = JOptionPane.showInputDialog("Ingresa tu usuario: ");
            loginPassword = JOptionPane.showInputDialog("Ingresa tu contrasena: ");
            if (user.authentication(loginUser, loginPassword)) {
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Acceso denegado");
            }
        }else{
            System.out.println("Los datos de ingreso no se registraron correctamente");
        }
    }
}