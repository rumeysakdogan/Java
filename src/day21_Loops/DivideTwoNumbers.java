package day21_Loops;

import java.util.Scanner;

/*
write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput: 3 with a remainder of 1

                10-3 = 7
                7-3 = 4
                4-3 = 1
 */
public class DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter second number:");
        int num2 = scan.nextInt();

        if(num2 == 0){
            System.out.println("Invalid input!");
            System.exit(0);
        }

        int count = 0;

        while (num1 >= num2) {
                num1 -= num2;
                count++;
        }
        
        System.out.println(count+" with the remainder of "+num1);
    }
}
