package day25_Practices;

import java.util.Scanner;

/*
 Write a program that will take five Strings and save them into an array called arr.
 and  Use for loop to print out the first three letter of each element of arr, one per line.
            You can assume that every element of arr is at least 3 letters long.
                Example: arr -> ["apple", "banana"]
                        prints:  appban

 */
public class FirstThreeLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 strings:");

        String[] arr = new String[5];
        String result = "";

        for (  int i = 0; i < arr.length; i++){
            arr[i] = scan.next();
        }

        for (String each : arr){
            if (each.length() > 3) {
                result += each.substring(0, 3);
            } else if (each.length() == 3){
                result += each;
            }
        }

        System.out.println(result);

    }
}
