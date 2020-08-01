package day22_NestedLoop;

import java.util.Scanner;

/*
Write a program that asks user to enter his/her username and
password until user enters  correctly.
                there are only three attempts
                after three attempts:  lock the account

 */
public class Credentials {
    public static void main(String[] args) {
        /*
        username: cyber
        password: tek123
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String userName = scan.next();

        System.out.println("Enter your password:");
        String password = scan.next();

        int attempt = 0;

        while (!(userName.equals("cyber") && password.equals("tek123"))) {

            if (attempt > 2) {
                System.out.println("Your account is locked!");
                System.exit(0);
            }

            System.out.println("Invalid username or password, Please re-enter");

            System.out.println("Enter your username:");
            userName = scan.next();

            System.out.println("Enter your password:");
            password = scan.next();

            attempt++;
        }

        System.out.println("Logged in!");

    }
}
