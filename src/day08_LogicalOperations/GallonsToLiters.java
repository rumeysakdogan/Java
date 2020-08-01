package day08_LogicalOperations;
/*
    task: write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785

 */
public class GallonsToLiters {

    public static void main(String[] args) {

        double gallons = 15;
        double liters  = gallons * 3.785;

        System.out.println(gallons+ " gallons is equal to "+liters+" liters");

    }
}
