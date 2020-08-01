package day21_Loops;

import java.util.Scanner;
// write a program that asks user to enter 5 numbers and returns the maximum and minimum number
public class MinAndMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 0;
        int min = 0;

        for (int i = 1; i <= 5; i++){

            System.out.println("Enter a number: ");
            int num1 = scan.nextInt();

            if (num1 > max){
                max = num1;
            }
            if(num1 < min){
                min = num1;
            }

        }

        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);

    }
}
