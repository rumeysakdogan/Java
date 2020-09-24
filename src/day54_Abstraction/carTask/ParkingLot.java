package day54_Abstraction.carTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ParkingLot {

    public static void main(String[] args) {

        // Car car1 = new Car();
        BMW bmw = new BMW();
        Tesla tesla = new Tesla();
        Toyota toyota = new Toyota();
        Jeep jeep = new Jeep();

        bmw.start();
        tesla.start();
        toyota.start();
        jeep.start();

       // create an arraylist of car, and store 3 toyota objetc, 3 bmw objects and 3 Tesla objects

        Car car1 = new BMW();
        Car car2 = new Tesla();
        Car car3 = new Toyota();
        Car car4 = new Jeep();

        ArrayList<Car> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1, car2, car3, car4, bmw, tesla, toyota, jeep));

        System.out.println();

    }
}
