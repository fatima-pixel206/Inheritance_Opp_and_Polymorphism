package OPP;

public class Employe {
    private String name;
    private String fatherName;
    private int age;
    Employe(){
        name=name;
        this.fatherName=fatherName;
        this.age=age;
    }
    public void setName(String name){
        this.name=name.toUpperCase();

    }
    public String getName(){
        return name;
    }


    public void setfatherName(String fatherName){
        this.fatherName=fatherName.toUpperCase();

    }
    public String getfatherName(){
        return fatherName;
    }


    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}

