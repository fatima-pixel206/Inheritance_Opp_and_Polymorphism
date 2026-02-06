package OPP;

public class AccountTest {
    public static void main(String[] args) {
        Account object=new Account();
        Account object1=new Account();
        Account object2=new Account();
        object.setName("fatima ");

        object1.setName(" Hira");
        object2.setName(" Ali");

        System.out.println(object.getName()+ "\n"+ object1.getName()+"\n"+object2.getName());
    }
}

