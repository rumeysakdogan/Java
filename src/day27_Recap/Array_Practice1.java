package day27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {

        String[] names = {"Aalia", "Nurbiye", "Ayse"};
//          index:           0         1        2

        System.out.println(names[1]);

        System.out.println("===============================");

         for (int i = 0; i < names.length; i++){
             if ( !names[i].toLowerCase().startsWith("a")){ // !names[i].charAt('A')
                 continue;
             }
             System.out.println(names[i]);
         }

        System.out.println("===============================");

         int[] nums = new int[5];

        nums[3] = 25;
        nums[0] = 100;
        nums[3] = 300;
        System.out.println(Arrays.toString(nums));

        System.out.println("===============================");

        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter:");

        String[] students = new String[scan.nextInt()];

        scan.nextLine();    // to take out enter in the scanner

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter a name:");
            students[i] = scan.nextLine();
        }

        System.out.println(Arrays.toString(students));








    }
}
