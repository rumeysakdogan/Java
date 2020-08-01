package day18_forLoop;

import java.util.Scanner;

/*
write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo

 */
public class emailDomain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your email address: ");
        String email = scan.next();

        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");

        String domain = email.substring(index1+1, index2);

        System.out.println("The domain of the email is: "+ domain);

    }
}
