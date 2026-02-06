package Polymorphism;



public class Car extends Vehicle {
    // public Object nothing;
    public void Runner(){
        System.out.println(" car is running ");
    }
    public void carRae(){
        System.out.println(" car can race");

    }
    public int Doors(){
        return 4;
    }

    @Override
    public void start() {
        System.out.println(" car start");
    }
}

