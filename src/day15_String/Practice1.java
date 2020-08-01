package day15_String;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Please enter your firstname:");
        String firstName = scan.next();
        char firstInitial = firstName.charAt(0);

        System.out.println("Please enter your lastname:");
        String lastName = scan.next();
        char lastInitial = lastName.charAt(0);

        System.out.println("Your initial is: "+firstInitial+lastInitial);

    }
}
