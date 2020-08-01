package day18_forLoop;

import java.util.Scanner;

/*
 write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method

 */
public class Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word:");

        String word = scan.next();

        // first solution:

        String str1 = word.substring(1);     //  "ava"
        String str2 = word.substring(0,1);   //  "J"
        String result = str1+str2;          // "avaJ"

        System.out.println(result);

        // second solution:

        char first = word.charAt(0);

        System.out.println(word.substring(1)+first);
    }
}
