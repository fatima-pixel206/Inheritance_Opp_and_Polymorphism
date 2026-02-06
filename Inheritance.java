package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Cat myCat = new Cat("cat");
        myCat.eat();
        myCat.walk();
        myCat.sleep();
        myCat.climb();
        Dog dogy = new Dog();
        dogy.sound();
        dogy.walk();
        dogy.eat();
        dogy.sleep();

    }
}
