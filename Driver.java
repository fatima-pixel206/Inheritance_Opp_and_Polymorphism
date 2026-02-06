package OPP;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        vichle myVichle = new vichle("Car", "Toyota", 2020, "ABC123", "John Doe", "123 Main St");

        // Displaying the vehicle details
        System.out.println("Vehicle Type: " + myVichle.getVichleType());
        System.out.println("Vehicle Name: " + myVichle.getVichlName());
        System.out.println("Vehicle Model: " + myVichle.getVichlModel());
        System.out.println("Vehicle Number: " + myVichle.getVichleNumber());
        System.out.println("Owner Name: " + myVichle.getOwnerName());
        System.out.println("Address: " + myVichle.getAddress());

        Scanner input=new Scanner(System.in);
        System.out.println(" Enter your vichle Type");
        String  type=input.nextLine();

        System.out.println(" Enter your vichle Name");
        String  name=input.nextLine();
        System.out.println(" Enter your vichle Model");
        int  Model=input.nextInt();
        System.out.println(" Enter your vichle Number");
        String  number=input.nextLine();
        System.out.println(" Enter your vichle OwnerName ");
        String  ownerName=input.nextLine();
        System.out.println(" Enter your vichle onwer address");
        String  address=input.nextLine();
        myVichle.setVichleType(type);
        myVichle.setVichlName(name);
        myVichle.setVichleModel(Model);
        myVichle.setVichleNumber(number);
        myVichle.setOwnerName(ownerName);
        myVichle.setAddress(address);

        System.out.println("Vehicle Type: " + myVichle.getVichleType());
        System.out.println("Vehicle Name: " + myVichle.getVichlName());
        System.out.println("Vehicle Model: " + myVichle.getVichlModel());
        System.out.println("Vehicle Number: " + myVichle.getVichleNumber());
        System.out.println("Owner Name: " + myVichle.getOwnerName());
        System.out.println("Address: " + myVichle.getAddress());




    }


}

