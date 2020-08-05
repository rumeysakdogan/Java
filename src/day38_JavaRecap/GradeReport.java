package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList( 100, 96, 85, 75, 55, 45, 73, 35, 47, 60, 87, 77, 67, 57, 47, 93, 83, 73, 63, 53, 43));

        ArrayList<Integer> gradeA = new ArrayList<>();  // 90 ~ 100
        gradeA.addAll( grades );
        gradeA.removeIf( p -> p < 90 );
        System.out.println( "Grade A: " + gradeA );
        System.out.println( "Number of students made A: " + gradeA.size() );


        ArrayList<Integer> gradeB = new ArrayList<>();  // 80 ~ 89
        gradeB.addAll( grades );
        gradeB.removeIf( p -> !( p >= 80 && p < 90) );   // another condition: (p < 80 || p > 89)
        System.out.println( "Grade B: " + gradeB );
        System.out.println( "Number of students made B: " + gradeB.size() );


        ArrayList<Integer> gradeC = new ArrayList<>();  // 70 ~ 79
        gradeC.addAll( grades );
        gradeC.removeIf( p -> !( p >= 70 && p < 80) );  // another condition: (p < 70 || p > 79)
        System.out.println( "Grade C: " + gradeC );
        System.out.println( "Number of students made C: " + gradeC.size() );


        ArrayList<Integer> gradeD = new ArrayList<>();  // 60 ~ 69
        gradeD.addAll( grades );
        gradeD.removeIf( p -> !( p >= 60 && p < 70) );  // another condition: (p < 60 || p > 69)
        System.out.println( "Grade D: " + gradeD );
        System.out.println( "Number of students made D: " + gradeD.size() );


        ArrayList<Integer> gradeF = new ArrayList<>();  // below 60
        gradeF.addAll( grades );

        gradeF.removeIf( p -> p > 59);
/*
        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);
*/
        System.out.println( "Grade F: " + gradeF );
        System.out.println( "Number of students made F: " + gradeF.size() );


    }
}
