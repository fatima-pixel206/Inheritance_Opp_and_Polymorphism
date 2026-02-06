package Polymorphism;

import java.util.Scanner;

public class CompositeNumbers {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" enter a number");
            int num = sc.nextInt();
            boolean isComposite=false  ;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(i + " ");
                    isComposite = true;

                }
            }

            if(isComposite){
                System.out.println( " yes "+num+" is composite number");
            }
            else {
                System.out.println(" not composite");

            }

        }

    }


