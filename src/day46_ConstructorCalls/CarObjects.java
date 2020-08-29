package day46_ConstructorCalls;

public class CarObjects {

    public static void main(String[] args) {

        System.out.println( new Car("Toyota"));

        System.out.println("==============================");

        System.out.println( new Car("BMW", "X5"));

        System.out.println("==============================");

        System.out.println( new Car("Audi", "Q7", 2019));

        System.out.println("==============================");

        System.out.println( new Car("Mercedes", "C63",2020,35000));

        System.out.println("==============================");

        System.out.println( new Car("Jeep", "Compass", 2010, 20000,"Red"));

   
    }

}
