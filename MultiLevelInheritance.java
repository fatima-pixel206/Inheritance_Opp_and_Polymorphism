package Inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        GrandFather GF = new GrandFather(" GrandFather ");
        GF.age(56);
        Parent par = new Parent(" Latif");
        par.age(34);
        par.pare();
        Child child = new Child("Child");
        //child.name="fatima";
        child.age(12);
        child.pare();
        child.child();
    }
}

class GrandFather{
    String name;
    GrandFather(String name ){
        this.name=name;
    }
    void age(int age){

        System.out.println( name+"  is  "+age+" years old");
    }


}

class Parent extends GrandFather {


    Parent(String namee) {
        super(namee);
    }
    void pare(){
        System.out.println( name+" iam chlid of granfather class");
    }

}