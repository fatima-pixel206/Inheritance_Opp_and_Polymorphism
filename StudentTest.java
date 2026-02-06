package OPP;

import java.util.Scanner;

public class StudentTest {


    public static void main(String[] args) {
        @SuppressWarnings("unused")

        Scanner input=new  Scanner(System.in);

        System.out.println(" enter marks for calculate percentage");
        Student object=new Student(00, 0, 0);
        System.out.println(" enter total marks");
        int totall=input.nextInt();
        object.setTotalMarks(totall);
        System.out.println(" enter yur obtain marks");
        int obtain=input.nextInt();
        object.setMarks(obtain);
        System.out.println(" your percentage is :" +object.getPercentage());
    }

}


