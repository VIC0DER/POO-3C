package Model;

public class SafeUser {
    private String username = "";
    private String password = "";
    public void setUsername(String username) {
        if (username != null || !username.isEmpty()) {
            this.username = username;
        }else{
            System.out.println("El usuario no puede estar vacio");
        }
    }

    public void setPassword(String password) {
        if(password.length()>=8 && checkPassword(password)){
            this.password = password;

        }else if(password.length()<8){
            System.out.println("La contrasena debe tener al menos 8 caracteres");
        }
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }

    public boolean checkPassword(String password){
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean number = false;
        int codeAscii;
        for (int i = 0; i < password.length(); i++) {
            codeAscii = password.charAt(i);
            if(codeAscii >= 65 && codeAscii <= 90){
                upperCase = true;
            }else if(codeAscii >= 97 && codeAscii <= 122){
                lowerCase = true;
            }else if(codeAscii >= 48 && codeAscii <= 57){
                number = true;
            }
        }

        if(!upperCase){
            System.out.println("La contrasena debe contener al menos una letra mayuscula");
        }
        if(!lowerCase){
            System.out.println("La contrasena debe contener al menos una letra minuscula");
        }
        if(!number){
            System.out.println("La contrasena debe contener al menos un numero");
        }
        return upperCase && lowerCase && number;
    }

    public boolean authentication(String username, String password){
        return username.equals(this.username) && password.equals(this.password);
    }
}
