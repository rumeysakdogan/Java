package day20_whileLoops;

import java.util.Scanner;

/*
Write aprogram that can remove the duplicates from any given String
        input: abcabcaabb
        output: abc

 */
public class removeDuplicates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++){
            String s = ""+ str.charAt(i);

            if (!result.contains(s)) {
                result += str.charAt(i);
            }
        }
        System.out.println(result);

        System.out.println("======================");

        // second way:

        String result2 = ""+str.charAt(0);

        for (int i = 0; i < str.length(); i++){
            String s = str.substring(i, i+1);

            if (result2.contains(s)) {
               continue;
            }
            result2 += str.charAt(i);
        }
        System.out.println(result2);

    }
}
