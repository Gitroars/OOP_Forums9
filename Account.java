

public class Account {
    private char tier;
    private long sn;
    private String ed;
    private int cvv;
    private int pin;
    private double balance = 0;
    public Account(char tier,long sn,String ed,int cvv,int pin, double balance){
        this.tier = tier;
        this.sn = sn;
        this.ed = ed;
        this.cvv = cvv;
        this.pin = pin;
        this.balance = balance;
    }

    public long getSn() {
        return sn;
    }
    public String getEd() {return ed;}
    public int getCvv() {
        return cvv;
    }
    public int getPin(){return pin;}

    public double getBalance() {
        return balance;
    }
    private void addBalance(double amt){
        balance += amt;
    }
    private void subtractBalance(double amt){balance -=amt;}

    public void deposit(double amt){
        switch (tier){
            case 'b':
                if(amt>0 &&amt<=50000000 && (amt%50000==0)){
                    addBalance(amt);
                }
                else{
                    System.out.println("Error: Invalid deposit amount");
                }
                break;
            case 'g':
                if(amt>0 && amt<=80000000 && (amt%50000==0)){
                    addBalance(amt);
                }
                else{
                    System.out.println("Error: Invalid deposit amount");
                }
                break;
            case 'p':
                if(amt>0 && amt<=100000000 && (amt%50000==0)){
                    addBalance(amt);
                }
                else{
                    System.out.println("Error: Invalid deposit amount");
                }
                break;
            default:
                System.out.println("Error: Invalid card tier");
        }


    }
    public void withdraw(double amt) {
        if (balance>=amt ) {
            if(amt>0 && amt<10000000 && (amt%50000==0)){
                subtractBalance(amt);
            }
            else{
                System.out.println("Error: Invalid withdraw amount");
            }
        }
        else if(balance < amt){
            System.out.println("Error: Insufficient balance");
        }
        else{
            System.out.println("Error: Invalid balance");
        }
    }
    public void transferSender(double amt){
        if(balance>0 && balance>=amt && amt>=10000){
            subtractBalance(amt);
        }
        else{
            System.out.println("Error: Invalid transfer");
        }
    }
    public void transferRecipient(double amt){
        addBalance(amt);
    }






}
