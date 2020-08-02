package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,7,8));

        list.removeIf( p -> Collections.frequency(list,p) == 1 );

        System.out.println(list);  // [1, 1, 2, 2, 3, 3]

        System.out.println("==============================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll( Arrays.asList("Nalan", "Anna", "Canada", "David", "Hannah", "Jim", "Ian", "Abida","Ebrahim", "Farida"));

        names.removeIf( p -> p.toLowerCase().charAt(0) != p.charAt(p.length()-1));

        System.out.println( names );

        System.out.println("==============================================");

        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47, 105, -20, -36, 120));

        ArrayList<Integer> gradeOfA = new ArrayList<>();
        ArrayList<Integer> gradeOfB = new ArrayList<>();
        ArrayList<Integer> gradeOfC = new ArrayList<>();
        ArrayList<Integer> gradeOfD = new ArrayList<>();
        ArrayList<Integer> gradeOfF = new ArrayList<>();

        gradeOfA.addAll(grades);

        gradeOfA.removeIf( p -> p < 90 || p > 100 || p < 0);

        System.out.println( gradeOfA );  // [100, 90]

        System.out.println("Number of students made A: " + gradeOfA.size());  // 2




        gradeOfB.addAll(grades);

        gradeOfB.removeIf( p -> !(p >= 80 && p < 90) || p > 100 || p < 0 );

        System.out.println( gradeOfB ); // [85, 85]

        System.out.println("Number of students made B: " + gradeOfB.size()); // 2


        gradeOfC.addAll(grades);

        gradeOfC.removeIf( p -> !(p >= 70 && p < 80) || p > 100 || p < 0);

        System.out.println( gradeOfC );  // [75, 73, 73]

        System.out.println("Number of students made C: " + gradeOfC.size());  // 3



        gradeOfD.addAll(grades);

        gradeOfD.removeIf( p -> !(p >= 60 && p < 70) || p > 100 || p < 0);

        System.out.println( gradeOfD );  // [65]

        System.out.println("Number of students made D: " + gradeOfD.size());  // 1



        gradeOfF.addAll(grades);

        gradeOfF.removeIf( p -> p >= 60 || p > 100 || p < 0);

        System.out.println( gradeOfF );  // [55, 45, 35, 47]

        System.out.println("Number of students made F: " + gradeOfF.size());  // 4





    }
}
