package OPP;

public class BankAccount {
    private String name;
    private double balance;
    public BankAccount(String name, double balance){
        this.name=name;
        this.balance=balance;

    }
    public void setName(String name){
        this.name=name.toUpperCase();
    }
    public String getName(){
        return name.toUpperCase();

    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;

    }
    public void setDeposit(double deposit){
        balance=balance+deposit;
    }
    public void setWithDraw(double withDraw){
        balance=balance-withDraw;
    }
}
