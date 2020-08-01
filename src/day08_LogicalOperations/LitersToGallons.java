package day08_LogicalOperations;
/*
    task: write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785

 */
public class LitersToGallons {

    public static void main(String[] args) {
        double liters = 15;
        double gallons = liters / 3.785;

        System.out.println(liters + " liters is equal to " + gallons + " gallons.");
    }
}
