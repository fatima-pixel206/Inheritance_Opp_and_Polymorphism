package Inheritance.Inheri2;

public class Inheritancetest {
    public static void main(String[] args) {
        Cat ca=new Cat("malll",4);
        ca.walk();
        ca.legsAndHands(2);
        ca.sleep();
    }
}
class Animal{
    String name;
    int legs;
    Animal(String name,int legs ){
        this.name=name;
    }
    void eat(){
        System.out.println(" All animal eat food");
    }
    void walk(){
        System.out.println(" some Animal can walk some can swim and some can fly and some can reptiles");
    }
    void sleep(){
        System.out.println(" all animal can sleep");
    }
    int legsAndHands(int legs ){
        System.out.println(" some animal have 4 legs and some have 2 "+legs);
        return legs;
    }

}
class Cat extends Animal{
    // String namee="Catty";
    // int legs=4;

    Cat(String name,int n) {

        super(name,n);
    }

    @Override
    void sleep() {
        System.out.println(" cat like to sleep");
        super.eat();
    }

    @Override
    int legsAndHands(int legs) {
        System.out.println(" cat have "+legs+" legs");
        // return super.legsAndHands(legs);

        return legs;
    }


}

