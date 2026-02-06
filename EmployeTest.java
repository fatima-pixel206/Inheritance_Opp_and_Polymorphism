package OPP;

import java.util.Scanner;

public class EmployeTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter your name");
        String name= input.nextLine();

        System.out.println(" Enter your father name");
        String fatherName= input.nextLine();
        System.out.println(" enter your age ");
        int age= input.nextInt();
        Employe test=new Employe();
        test.setName(name);
        test.setfatherName(fatherName);
        test.setAge(age);
        System.out.println("  Name : "+test.getName()+"\n  Father Name:"+test.getfatherName()+"  \n Age "+test.getAge());
    }
}
