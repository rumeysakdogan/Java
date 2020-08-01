package day16_String;

import java.util.Scanner;

/*
        write a program that can check if the given website is
        a valid website or not
        note: web address MUST start with "www."
 */
public class ValidWebsite {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of website: ");
        String website = in.next();

        boolean validWebsite = website.startsWith("www.");

        String result = (validWebsite)? "valid website" : "invalid website";

        System.out.println(result);
    }
}
