package OPP;

public class DriveCar {

        public static void main(String[] args) {

            Car my=new Car();
            my.addFuel(6);
            my.start();
            my.Drive();

            my.start();
            my.Drive();
            my.Drive();
       /*  my.Drive();

      my.Drive();
       my.addFuel(4);
        my.Drive(); */
            System.out.println(my.currentFuel());


        }

    }


