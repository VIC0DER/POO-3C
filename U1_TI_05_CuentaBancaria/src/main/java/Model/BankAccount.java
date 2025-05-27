package Model;

public class BankAccount {
    private String owner = "John Doe";
    private double balance = 0.0;

    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
            System.out.println("Depósito de $"+amount+" exitoso");
            System.out.println("Saldo actual: " + balance);
        }else{
            System.out.println("Depósito fallido");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println("Retiro de $"+amount+" exitoso");
            System.out.println("Saldo actual: " + balance);
            return true;
        }else{
            System.out.println("Retiro fallido");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
