package day50_Inheritance_Overriding.carTask;
/*
Jeep:
    start(): Call Mechanic
             Oil Change
             jump start

 */
public class Jeep extends Car{


    public void start() {
        System.out.println("Call Mechanic");
        System.out.println("Oil Change");
        System.out.println("Jump start");
    }
}
