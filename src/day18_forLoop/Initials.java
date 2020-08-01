package day18_forLoop;

import java.util.Scanner;

/*
write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method
 */
public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your firstname: ");
        String firstName = scan.next();

        System.out.println("Please enter your lastname: ");
        String lastName = scan.next();

        String initial = firstName.substring(0,1) + lastName.substring(0,1);
        // initial = initial.toUpperCase();

        System.out.println("Your initial is: "+initial.toUpperCase());

//        second approach: preferred unless it is stated not to
//        char first = firstName.charAt(0);
//        char last = lastName.charAt(0);
//
//        String initial = ("" + first + last).toUpperCase();
//        System.out.println("Your initial is: "+initial);

    }
}
