package day29_CustomMethods;

import java.util.Scanner;

public class CalculateAge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter birth year and current year:");

        calculateAge( scan.nextInt(),scan.nextInt() );

    }

    public static void calculateAge(int birthYear, int currentYear){
        if ( currentYear < birthYear){
            System.exit(0);
        }else {
            int age = currentYear - birthYear;
            System.out.println("You are " + age + " years old.");
        }
    }

}
