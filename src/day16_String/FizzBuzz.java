package day16_String;

import java.util.Scanner;

/*
1. Write a program StartEndWords:
    you have 2 words that must be 5 characters, and check if last letter of first word
    and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"

        NOTE: you will need nested If
 */
public class FizzBuzz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word: ");
        String word1 = scan.next();
        System.out.println("Enter your second word: ");
        String word2 = scan.next();

        boolean fiveChar = (word1.length()==5) && (word2.length()==5);
        boolean lastFirst = word1.charAt(word1.length()-1) == word2.charAt(0);

        String result = "";

        if(fiveChar){
            if(lastFirst){
               result = "Fizz";
            }else{
                result = "Buzz";
            }
        }else{
            result = "need to be exactly 5 chars length";
        }
        System.out.println(result);

    }
}
