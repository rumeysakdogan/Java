package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
/*
       Collections Class:
        Collections.sort()
        Collections.swap()
        Collections.frequency()

        Collections.max()
        Collections.min()
        Collections.replaceAll()

 */
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R', 'S', 'O', 'P', 'D', 'A', 'C', 'B'));

        System.out.println(chars);                       // [R, S, O, P, D, A, C, B]

        Collections.sort(chars);

        System.out.println(chars);                       // [A, B, C, D, O, P, R, S]


        System.out.println("========================================================");


        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Aslan", "Cristina", "Zeliha", "Iman", "Fatima", "Mohammed"));

        System.out.println(students);

        Collections.swap(students, 1, 4);
        Collections.swap(students, 1, 4);

        System.out.println(students);

        Collections.swap(students, 0, students.size() - 1);

        System.out.println(students);


        System.out.println("========================================================");


        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("tea", "coffee", "coffee", "egg", "battery", "battery", "battery", "battery"));

        int count = Collections.frequency(items, "battery");

        System.out.println(count);


        System.out.println("========================================================");


        ArrayList<String> uniques = new ArrayList<>();
        items.removeIf(p -> Collections.frequency(items, p) != 1);
        uniques.addAll(items);

        System.out.println(uniques);

        // another approach:
        ArrayList<String> uniques2 = new ArrayList<>();
        uniques2.addAll(items);
        uniques2.removeIf(p -> Collections.frequency(items, p) != 1);

        System.out.println(uniques2);


        System.out.println("========================================================");


        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll( Arrays.asList(10, 9, 89, 100, 2000, 3000, 30, 40, -50, 1000, 1000));

        Integer max = Collections.max(nums);
        Integer min = Collections.min(nums);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        Collections.replaceAll(nums,1000,100000);

        System.out.println( nums );


    }
}
