package day23_Arrays;

import java.util.Scanner;

/*
 write a program for the room reservation:
            King Bed ==> $120
            Queen Bed ==> $100
            single Bed ==> $80
            the program asks the user which bedroom does he/she wants to reserve and calculates the total price
            and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outer loop need to be an infinite loop

 */
public class CybertekInn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;
        System.out.println("Welcome to Cybertek Inn!");

        while (true) {
            System.out.println("Please choose from the following: ");
            System.out.println("1. King Bed: $120");
            System.out.println("2. Queen Bed: $100");
            System.out.println("3. Single Bed: $80");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    total += 120;
                    break;
                case 2:
                    total += 100;
                    break;
                case 3:
                    total += 80;
                    break;
                default:
                    System.out.println("Please enter one of these three numbers: 1, 2 or 3");
            }

            System.out.println("Do you want to reserve another room?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid answer, please enter yes or no!");
                System.out.println("Do you want to reserve another room?");
                answer = scan.next().toLowerCase();
            }

            if( answer.equals("no")){
                break;
            }
        }

        System.out.println("Total price is: $" + total);


    }
}
