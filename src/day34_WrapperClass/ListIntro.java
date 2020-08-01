package day34_WrapperClass;

import java.util.ArrayList;

public class ListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
            scores.add(95); // autoboxing added to index0
            scores.add(100); //           added to index1
            scores.add(85); //            added to index2
            scores.add(75);
            scores.add(1,65); // 65 added to index1, 100 shifted to next index
             // [95, 65, 100, 85, 75]


        System.out.println( scores ); // [95, 100, 85]  // [95, 100, 85, 75]

        System.out.println( scores.get(2)); // 100

        System.out.println( scores.size() );  // 5
    }
}
