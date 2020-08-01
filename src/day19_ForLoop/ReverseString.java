package day19_ForLoop;

import java.util.Scanner;

/*
write a program that can reverse any string
    input:
            muhtar
    output:
            rathum
 */
public class ReverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = scan.next();
        String word2 = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            word2 += word.charAt(i);
        }

        System.out.println(word2);

    }
}