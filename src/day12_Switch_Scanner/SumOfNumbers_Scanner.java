package day12_Switch_Scanner;

import java.util.Scanner;

public class SumOfNumbers_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        double num2 = scan.nextDouble();

        System.out.println("Please enter your second number: ");
        double num3 = scan.nextDouble();

        double sum = num2+num3;

        System.out.println("Sum of "+num2+" "+num3+" is: "+sum);


    }
}
