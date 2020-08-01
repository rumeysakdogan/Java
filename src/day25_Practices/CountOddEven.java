package day25_Practices;

// Write a program that can count the even and odd number from an array of integers

import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        int countEven = 0;
        int countOdd = 0;

        String even = "";
        String odd = "";

        for (int each : arr){
            each = scan.nextInt();
            if ( each % 2 == 0){
                countEven++;
                even += each+" ";
            } else {
                countOdd++;
                odd += each +" ";
            }
        }

        System.out.println( "Even numbers: "+even+"\n"+"Number of even numbers :" + countEven );
        System.out.println( "Odd numbers: "+odd+"\n"+"Number of odd numbers :" + countOdd );

    }
}
