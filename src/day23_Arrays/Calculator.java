package day23_Arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter two numbers:");
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();

            System.out.println("Enter the math operator:");
            char operator = scan.next().charAt(0);
/*
            double result = ( operator == '+' ) ? (num1 + num2) :( operator == '-' ) ? (num1 - num2) :( operator == '*' )
                    ? (num1 * num2)  :( operator == '/' ) ? (num1 / num2) :( operator == '%' ) ? (num1 / num2)
                    : 0;

            System.out.println(result);

 */
            switch (operator) {
                case '+':
                    System.out.println( num1 + num2 );
                    break;
                case '-':
                    System.out.println( num1 - num2 );
                    break;
                case '*':
                    System.out.println( num1 * num2 );
                    break;
                case '/':
                    System.out.println( num1 / num2 );
                    break;
                case '%':
                    System.out.println( num1 % num2 );
                    break;
                default:
                    System.out.println("Invalid operator!");
            }

            System.out.println("Do you want to continue?");
            String answer = scan.next().toLowerCase();

            while ( !(answer.equals("yes") || answer.equals("no")) ) {      // while the  answer is invalid
                System.out.println("Invalid answer, please enter yes or no:");
                System.out.println("Do you want to continue?");
                answer = scan.next().toLowerCase();
            }
            if (answer.equals("no")) {
                break;
            }
        }

        System.out.println("Thank you for using Cybertek's Calculator");

        System.exit(0);
    }
}
