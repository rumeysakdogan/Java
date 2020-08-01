package day19_ForLoop;
/*
2. palindrome
level ==> level ==> true
mom ==> mom  ==> true
muhtar ==> rathum ==> false

 */

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word1 = scan.nextLine();

        String reverse = "";

        for (int i = word1.length()-1; i>=0; i--){
            reverse += word1.charAt(i); // word1.substring(i,i+1)
        }
        System.out.println(reverse);
        System.out.println(word1.equals(reverse));
    }
}
