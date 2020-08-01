package day27_Recap;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        /*
        sort(): sorts array in ascending order
        toString(): to print arrays as String
        equals():  to compare to arrays index by index , returns true or false
         */

        String[] names = {"Odina", "Zeliha", "Lillia", "Berk", "Emine"};
        //                   [Berk, Emine, Lillia, Odina, Zeliha]

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("==============================================");

        int[] grades = {80, 75, 65, 110, 90, 45, 56, 78};
        //                  min                                  max
        //              [    45     , 56, 65, 75, 78, 80, 90,    110     ]
        // index #:           0                             grades.length-1
        Arrays.sort(grades);

        System.out.println(Arrays.toString(grades));

        System.out.println("Max: "+ grades[grades.length-1]);
        System.out.println("Min: "+ grades[0]);

        System.out.println("==============================================");

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "B", "C"};

        System.out.println(     Arrays.equals(s1, s2)   );      // TRUE

        String[] s3 = {"C", "A", "B"};

        System.out.println(     Arrays.equals(s2, s3)   );      // FALSE

        String[] a1 = {"A", "C" , "B"};
        String[] a2 = {"B", "A" , "C"};

        System.out.println(     Arrays.equals(a1, a2)   );      // FALSE

        Arrays.sort(a1); // a1 : {"A", "B", "C"};
        Arrays.sort(a2); // a2:  {"A", "B", "C"};

        System.out.println(     Arrays.equals(a1, a2)   );      // TRUE
        
    }
}
