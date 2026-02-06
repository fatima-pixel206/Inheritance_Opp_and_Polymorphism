package OPP;

import java.util.Scanner;

public class BankAccountTest  {
    private BankAccountTest(String name, double balance) {

    }

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println(" Enter your Name");
        String name= input.nextLine();
        BankAccount bank=new BankAccount("fatima",2345.00);
        bank.setName(name);
        System.out.println(" enter amount you want to deposit");
        double depo= input.nextDouble();
        bank.setDeposit(depo);
        System.out.println(" enter amount you want to withDraw");
        double withDraw= input.nextDouble();
        bank.setWithDraw(withDraw);
        System.out.println(bank.getName()+"\n "+bank.getBalance());
    }
}
