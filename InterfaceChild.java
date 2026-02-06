package Inheritance;

import java.lang.classfile.Interfaces;

class InterfaceChild   implements Interfaces {
    public static void main(String[] args) {
    }

    @Override
    public void start ( ) {

        System.out.println(" fatima");
    }
}
class internal  extends interfaceChild implements Interfaces{

    @Override
    public void start() {
        System.out.println(" nothing");
    }
}
