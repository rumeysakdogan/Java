package day15_String;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = scan.next();
        System.out.println("Please enter your last name: ");
        String lastName = scan.next();

        String fullName = firstName.concat(" "+lastName);

        System.out.println(fullName);
    }
}
