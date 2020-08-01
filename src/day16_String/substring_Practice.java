package day16_String;
/*
1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
import java.util.Scanner;

public class substring_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String word1 = scan.next();

        System.out.println("Enter second word: ");
        String word2 = scan.next();

        String word3 = word1.substring(1).concat(word2.substring(1));
        System.out.println(word3);
    }
}
