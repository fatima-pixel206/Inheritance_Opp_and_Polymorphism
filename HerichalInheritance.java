package Inheritance.Inheri2;


    // herachal
// date 25/11 /2025
    class Animal2{
        String name;
        Animal2(String name){
            this.name=name;
        }
        void eat(){
            System.out.println(name+"is eating  ");
        }
        void sleep(){
            System.out.println(name+"  is sleeping ");
        }
        void walk(){
            System.out.println(name+"walking ");
        }
    }
    // chlid class
    class Cat2 extends Animal2 {
        Cat2(String nam){

            super(nam);
        }
        void climb(){
            System.out.println(name+" can climb");
        }


    }
    // second child
     class Dog2 extends Animal2 {
        Dog2 (){
            super(" Dog ");

        }
        void sound (){

            System.out.println(name+" is barking ");
        }

    }
   public   class HerichalInheritance{
        public static void main(String[] args) {
            Cat2 myCat=new Cat2("catu");
            myCat.eat();
            myCat.walk();
            myCat.sleep();
            myCat.climb();
            Dog2 dogy=new Dog2();
            dogy.sound();
            dogy.walk();
            dogy.eat();
            dogy.sleep();

        }
    }


