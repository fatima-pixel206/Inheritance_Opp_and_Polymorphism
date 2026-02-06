package OPP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class BankTime {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        BankUtility object = new BankUtility();

        // --- Read last visit from file ---
        int lastDate = 1, lastMonth = 1, lastYear = 2000; // defaults
        try {
            File file = new File("last_visit.txt");
            Scanner fileReader = new Scanner(file);
            if (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                lastDate = Integer.parseInt(parts[0]);
                lastMonth = Integer.parseInt(parts[1]);
                lastYear = Integer.parseInt(parts[2]);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            // File doesn't exist, will use defaults
        }

        // Now use lastDate, lastMonth, lastYear in your Time constructor
        Time obj = new Time(lastDate, lastMonth, lastYear);

        System.out.println("Your last visit was on: " +
                obj.getDate() + "/" + obj.getMonth() + "/" + obj.getYear());

        System.out.println("Enter your name: ");
        String name = var.nextLine();
        System.out.println("Enter your balance: ");
        double balance = var.nextDouble();
        object.setName(name);
        object.setBalance(balance);

        System.out.println("Your name is: " + object.getName() +
                " and your balance is " + object.getBalance());

        System.out.println("ENTER MONEY YOU DEPOSIT");
        double depo = var.nextDouble();
        object.deposit(depo);
        System.out.println("Your total money after deposit is " + object.getBalance());

        // Now get new date from user
        System.out.println("Enter date you deposit money: ");
        int date = var.nextInt();
        System.out.println("Enter month you deposit money: ");
        int month = var.nextInt();
        System.out.println("Enter year you deposit money: ");
        int year = var.nextInt();
        obj.setDate(date);
        obj.setMonth(month);
        obj.setYear(year);

        System.out.println("On this date you deposit: " +
                obj.getDate() + "," + obj.getMonth() + "," + obj.getYear());

        // --- Save new visit date to file ---
        try {
            FileWriter writer = new FileWriter("last_visit.txt");
            writer.write(obj.getDate() + "," + obj.getMonth() + "," + obj.getYear());
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while saving the date.");
        }

    }
}


