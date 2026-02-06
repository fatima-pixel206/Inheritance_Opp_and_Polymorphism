package Inheritance;

class ComingChild extends Child {
    ComingChild(String name) {
        super(name);
    }

    void comeOn() {
        System.out.println(name + " iam coming child.....");
    }

}
