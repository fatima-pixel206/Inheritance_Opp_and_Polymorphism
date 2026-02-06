package Polymorphism;

public class OverridingExample {
    public static void main(String[] args) {
        MOM mommy=new Son();
        MOM mama= new Daughter();
        Daughter dude=new Daughter();
        Son rude=new Son();
        MOM maa=new MOM();
        mommy.love();// override by son here the execution will be son class
        mommy.talk();//override by son here the execution will be son class
        mommy.work();//override by son here the execution will be son class

        mama.talk();//override by Daughter here the execution will be son clas
        mama.love();//override by Daughter here the execution will be son clas
        mama.work();//override by Daughter here the execution will be son clas

        dude.MakeUp();// execute daughter's personal method
        dude.work();// override
        dude.talk();// override
        dude.love();// override
//
        rude.dance();// son personal method
        rude.work();// override
        rude.talk();// override
        rude.love();// override
//
        maa.work();// MOM
        maa.love();
        maa.talk();
    }
}
class MOM{
    void talk(){
        System.out.println(" politly");
    }
    void work(){
        System.out.println("hardly");
    }
    void love(){
        System.out.println(" countless ");
    }
}
class Son extends MOM{
    @Override
    void talk() {
        System.out.println(" mannerless");
        // super.talk();
    }

    @Override
    void work() {
        System.out.println(" kam he nh krta such a useless ");
        // super.work();
    }

    @Override
    void love() {
        System.out.println(" play boy");
        // super.love();
    }
    void  dance(){
        System.out.println(" smartly");
    }
}
class Daughter extends MOM{
    @Override
    void love() {
        System.out.println(" meaningfull");
        // super.love();
    }

    @Override
    void talk() {
        System.out.println(" shameless");
        // super.talk();
    }

    @Override
    void work() {
        System.out.println(" bad work");
        //  super.work();
    }
    void MakeUp(){
        System.out.println(" all time ");
    }
}
