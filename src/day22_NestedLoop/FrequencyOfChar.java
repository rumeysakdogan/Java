package day22_NestedLoop;

import java.util.Scanner;

/*
Write a program that can asks user to enter one string and
one char and then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4
                Input: ABCC
                       C
                Output: 2

 */
public class FrequencyOfChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char ch = scan.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++ ){

            char each = str.charAt(i);

            if ( each == ch ){
                count += 1 ;
            }
        }

/*
         int i = 0;
         while ( i < str.length() ){
            char each = str.charAt(i);

            if ( each == ch ){
                count += 1 ;
            }
            i++;
         }

*/
            System.out.println(count);
    }
}
