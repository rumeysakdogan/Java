package day20_whileLoops;

import java.util.Scanner;

/*
Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120
 */
public class factorialNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");

        double factorial = 1;

        for(int i = scan.nextInt(); i >= 1; i--){
            factorial *= i;
        }

        System.out.println("The factorial is: "+factorial);
    }
}
