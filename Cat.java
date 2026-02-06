package Inheritance;

// chlid class
class Cat extends Animal {
    Cat(String nam) {
        super(nam);
    }

    void climb() {
        System.out.println(name + " can climb");
    }


}
