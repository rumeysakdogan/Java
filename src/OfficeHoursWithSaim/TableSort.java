package OfficeHoursWithSaim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Let's say there is a table on a web page and you sorted it. This table was given to you as a Set of Strings. Verify if the the table was sorted appropriately

 */
public class TableSort {
    public static void main(String[] args) {
        String s = "java";
        String s2 = "apple";
        System.out.println( s.compareTo(s2));

        Set<String> set = new LinkedHashSet<>(Arrays.asList("abc", "java", "data", "zebra"));

        System.out.println( isSorted(set));
    }

    public static boolean isSorted(Set<String> set){

        ArrayList<String> list = new ArrayList<>(set);

        for (int i = 0; i < list.size()-1; i++) {

            String first = list.get(i);
            String second = list.get(i+1);

            if (first.compareTo(second) > 0){
                return false;
            }
        }
     return true;
    }

    /*
        compareTo method from String class
            ex: s.compareTo(s2)

                0        -> Strings are equal
            positive num -> s comes after s2 lexicographically (alphabetically - dictionary way comparison)
            negative num -> s comes before s2
     */

    // s = "java"
    // s2 = "apple"
    // s.compareTo()
}
