package Polymorphism;
public class DogOverloading {
    DogOverloading(){
        System.out.println(" my default constructor");
    }
    DogOverloading(String name){
        System.out.println(name);
    }
    public void bark() {
        System.out.println(" bhhaooo");// dog barks one time
    }

    public void bark(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("bhooo");// Dog barks n times
        }

    }
    // it must differ type ,parameters, and sequence if you have array and number in one method  then it is must you change the s
    // seqauence
    // it doese not focus on retrun type

    public static void main(String[] args) {
        DogOverloading bark=new DogOverloading(" fatima");
        // compile time overloading
        bark.bark();
        bark.bark(8);
    }
}