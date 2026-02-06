package Inheritance;

// herachal
// date 25/11 /2025
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + "is eating  ");
    }

    void sleep() {
        System.out.println(name + "  is sleeping ");
    }

    void walk() {
        System.out.println(name + "walking ");
    }
}
