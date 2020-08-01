package day13_Scanner;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your company name: ");

        String companyName = scan.next(); // returns only the first word

        System.out.println("Your company name is: "+companyName);


    }
}
