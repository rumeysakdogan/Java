package day23_Arrays;

import java.util.Scanner;

/*
  1. write a program that will ask user to enter two numbers and calculates the sum of
   those two numbers. then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the answer is not a valid answer (not yes or no),
                    the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outer loop need to be an infinite loop
 */
public class Addition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers:");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            int result = num1 + num2;
            System.out.println(result);

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

    }
}
