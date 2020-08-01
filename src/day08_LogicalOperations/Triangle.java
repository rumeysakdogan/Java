package day08_LogicalOperations;

public class Triangle {

    public static void main(String[] args) {

        double angle1 = 100;
        double angle2 = 35;
        double angle3 = 60;
        double sum= angle1 + angle2 + angle3;

        if (sum == 180){
            System.out.println("valid triangle");
        }
        if (sum != 180) {
            System.out.println("invalid triangle");

            // Muhtar's approach:

            //boolean valid = angle1 + angle2 + angle3 == 180;
            //boolean invalid = !valid;
            // if (valid){
            // System.out.println("Valid Triangle!");
            // }
            // if (invalid){
            // System.out.println("Invalid triangle!");
            // }
        }

    }
}
