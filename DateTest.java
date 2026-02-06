package OPP;

import java.util.Scanner;
public class DateTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Date date= new Date(11,11,12);
        System.out.println(date.getDate( )+" "+date.getMonth()+" "+date.getYear());
    }

}
