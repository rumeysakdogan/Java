package day13_Scanner;

import java.util.Scanner;

public class Scanner_NextLine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your company: ");
        String companyName = scan.nextLine();

        System.out.println("Enter your address: ");
        String address = scan.nextLine();

        System.out.println("Your fullname is: "+fullName);
        System.out.println("Your company name is: "+companyName);
        System.out.println("Your address is: "+address);
    }
}
