package day16_String;

import java.util.Scanner;

public class equalWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your first word: ");
        String word1 = in.next();

        System.out.println("Enter your second word: ");
        String word2 = in.next();

        String result = (word1.equalsIgnoreCase(word2)) ? "equal" : " not equal";

        System.out.println(result);

    }
}
