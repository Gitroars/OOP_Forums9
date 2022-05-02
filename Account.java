public class Account {
    private double balance;
    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public boolean deposit(double amt){
        balance += amt;
        return true;
    }
    public boolean withdraw(double amt){
        balance -=amt;
        return true;
    }
}