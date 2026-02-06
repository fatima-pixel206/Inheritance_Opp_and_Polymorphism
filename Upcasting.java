package Polymorphism;

public class Upcasting {
    public static void main(String[] args) {
        parents pro=new child();
        pro.Fly();// this will execute child method override
        pro.SuperMan();// parent method
        //  note the child method will not  call here because the reference decide which  method is able to call
        // reference call and object run override


        //============== now check this same  in inheritance
        // parent or superclass
        parents power=new parents();
        power.SuperMan();
        power.Fly();// this will execute parent method
        //===== child taste
        child chill=new child();
        chill.Fly();// this will execute child method override
        chill.SuperMan();// extended parent method
        chill.Batman();// its own method
    }
}
class parents{
    void SuperMan(){
        System.out.println(" parent has superman's powers");

    }
    void Fly(){
        System.out.println(" parent can fly ");
    }

}
class child extends parents{
    void Batman(){
        System.out.println(" child has superpowers of batman");
    }
    @Override
    void Fly() {
        System.out.println(" child can fly and over jump");
    }
}

