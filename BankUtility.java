package OPP;
public class BankUtility{
    private String name;
    private double balance;
    // public BankUtility(String name,double balance){
    //     this.name=name;
    //     this.balance=balance;

    public void  deposit(double dep){
        balance=balance +dep;
    }
    public void  withdraw(double with){
        balance=balance -with;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
}

