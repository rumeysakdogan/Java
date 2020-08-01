package day20_whileLoops;

import java.util.Scanner;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();

        int i = sentence.length()-1;
        String reversed = "";

        while( i >= 0 ){
            reversed += sentence.charAt(i);
            i--;
        }

        System.out.println(reversed);

        System.out.println("==============================");

        int num = 10;

        while (num < 15){
            System.out.println("Cybertek");
            num++;
        }
    }
}
