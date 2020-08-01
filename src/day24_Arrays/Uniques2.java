package day24_Arrays;

import java.util.Scanner;

public class Uniques2 {
    public static void main(String[] args) {

        // second approach: (will work for any data structures)

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = "";


          for (int j = 0; j < str.length() ; j++) {
                 char ch1 = str.charAt(j);
                 int count = 0;

                 for (int i = 0; i < str.length(); i++) {

                  char each = str.charAt(i);

                    if (ch1 == each) {
                            count++;
                      }
                 }
                if (count == 1) {
                     result += ch1;
                 }
          }

        System.out.println(result);


    }
}
