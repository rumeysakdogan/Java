package day15_String;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please write a sentence:");

        String sentence = scan.nextLine();

        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length()-1);

        System.out.println("First character is: "+firstChar+",last character is: "+lastChar);

        System.out.println("---------------------");

        System.out.println("Please write to words: ");

        String word1 = scan.next();
        String word2 = scan.next();

        String result = "";

        if(word1.length() >word2.length()){
            result = word1;
        }else{
            result = word2;
        }

        System.out.println(result);

        System.out.println("---------------------");

        word1 = word1.concat(word2);

        System.out.println(word1);
    }
}
