package day16_String;

import java.util.Scanner;

/*
3. write a program that can check if the given
        gmail address is valid gmail account or not
        NOTE: a valid gmail account ends with @gmail.com
 */
public class ValidEmail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your gmail address: ");
        String email = in.next();

        String result = "";

        boolean isValid = email.endsWith("@gmail.com");

        if(isValid){
            result = "Valid gmail account";
        }else{
            result = "Invalid gmail account";
        }
        System.out.println(result);
    }
}
