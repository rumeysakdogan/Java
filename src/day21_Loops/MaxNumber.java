package day21_Loops;

// 1. write a program that asks user to enter 5 numbers and returns the maximum number

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648; // assign the smallest integer so that first num is always greater than max

        for (int i = 0; i < 5; i++){

            System.out.println("Enter a number: ");
            int num1 = scan.nextInt();

            if (num1 > max){
                max = num1;
            }
        }
        System.out.println("Max number: "+max);


    }
}
