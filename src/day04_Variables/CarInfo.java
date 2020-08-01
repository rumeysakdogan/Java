package day04_Variables;
/*
Task: declare following variables.
        Year
        Brand
        Model
        Mileage
        Price
        color
        print out information of car

        Ex:
            20202
            BMW
            X5
            red
            30000
            45000

         output:

            2020 BMW X5 Red, 30000 miles, $45000


 */
public class CarInfo {

    public static void main(String[] args) {

        int year = 2020;
        String brand = "BMW";
        String model = "X5";
        int mileage = 30_000;
        double price = 45_000;
        String color = "Red";

        // 2020 BMW X5 Red, 30000 miles, $45000.0
        
        System.out.println(year + " " + brand + " " + model + " " + color +", " + mileage + " " + "miles, $" + price);

    }
}
