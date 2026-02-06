package Polymorphism;

public class Overloading {
    public static void main(String[] args) {
        System.out.println(add(2,5,6));

        Overloading over=new Overloading();
        System.out.println(over.add(2,4));
        System.out.println(over.add(2,3,4,5));
        // static
        System.out.println(over.add("Fatima"," Arain"));
    }
    public static int add(int a,int b,int c){
        return a+b+c;

    }

    // method
    int add(int a,int b){
        return a+b;
    }
    // method 2
    public  int add(int a,int b,int c ,int d){
        return a+b+c*d;
    }

    // for string it will concitrate
    public String add(String a,String b){
        return a+b;
    }

}
