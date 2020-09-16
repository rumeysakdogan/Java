package day54_Abstraction.carTask;

public class BMW extends Car{

    // to be a sub class of an abtract class, we need to override the abstract method.
    // making class abstract will prevent compile error but it gives a logical error because bmw isa concrete class and we would like to create objects of it.

    @Override
    public void start() {
        System.out.println("Starting BMW by: Push the start button");
    }
}
