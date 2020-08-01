package day28_Recap;

import java.util.Scanner;

public class FrequencyOfWord_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scan.nextLine();
        System.out.println("enter a word");
        String word = scan.next();

        int count = 0;

        for (int i = 0; i <= str.length() - word.length(); i++){

            if (str.substring(i,i + word.length()).equalsIgnoreCase(word)){
                count++;
            }
        }

        System.out.println(count);
    }
}
