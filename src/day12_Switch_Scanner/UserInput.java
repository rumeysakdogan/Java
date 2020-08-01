package day12_Switch_Scanner;
import java.util.Scanner;           // only imports scanner class from java.util
import java.util.*;                 // imports everything from java.util package

public class UserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //  int num1 = input.nextInt();
        //  long num2 = input.nextLong();

        double num3 = input.nextDouble();
        System.out.println("Your number is: " +num3);

    }

}
