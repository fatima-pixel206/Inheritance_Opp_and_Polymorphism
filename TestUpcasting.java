package Polymorphism;



public class TestUpcasting {
    //  private static Object Veh;

    public static <Child> void main(String[] args) {
        Car c=new Car();
        Vehicle veh= new Vehicle();
        Vehicle vCar=new Car();// yes car is vehicle
        AirPlane air=new AirPlane();
        Vehicle vAir=new AirPlane();

        CastTest(veh);
        //  CastTest(vCar);// this is beacuse this is reference of vehcile but  have object of car
        // /        CastTest(veh);
        CastTest(c);// ye is liye posssible hai q kai method ko bs vehivle chaye phir car  ho ya airplane no matter
//        CastTest(air);
//        CastTest(vAir);
        /*  Car carV=new Vehicle(); but every vehicle is not car */
        // Car carV =(Car)new Vehicle(); // this is possible ,but it will not execute
        // Object ref=new Vehicle();
        Object reffi=new Car();
        // CastTest((Vehicle) reffi); also psossibe;

    }
    private static void CastTest(Vehicle veh) {
        // object of vehili{
        veh.start();
        // hum yahn child k refrence sy parent ko bula skty hain q kai hum janty hain vehcile car he confrim
        // Car cVehcile=(Car)  veh;// this is called explicit casting
        //veh.start();// this is for vehicle directly
        // cVehcile.start();// this is specaily for car
        //  cVehcile.Runner();
        //  cVehcile.Break();// vehicle method
        //   cVehcile.carRae();
        //   ((Car) veh).carRae();// first cast then use
        //   System.out.println( cVehcile.Doors());
        //  System.out.println( ((Car) veh).Doors());
    }
}
