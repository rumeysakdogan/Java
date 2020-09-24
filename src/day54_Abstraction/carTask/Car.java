package day54_Abstraction.carTask;
/*
Ex2:

    Car: abstract
        start();
    BMW
        start(): push start button
    Tesla
        start(): voice control
    Toyota
        start(): Insert the key
    Jeep
        start(): jump start

 */
public abstract class Car {   // cannot be final

    public abstract void start();

}


final class A{   // CAN BE FINAL

}

class B{
    public static void main(String[] args) {
        A obj1 = new A();
       // Car obj2 = new Car();  => you cannot create an object from an abstract class
    }
}