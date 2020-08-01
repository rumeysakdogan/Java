package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
/*
        Arrays: utility class for array
        Collections: utility class for collection

 */
    public static void main(String[] args) {

     // sort() : sorts the elements of arrayList in ascending order

        ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(20,15,10,40,30));

            Collections.sort( list);  // [10, 15, 20, 30, 40]

        System.out.println( list );  // before sorting :  [20, 15, 10, 40, 30]

        System.out.println( "Max: " + list.get(list.size()-1) );
        System.out.println("Min: " + list.get(0) );

     // swap() : swaps the elements at the given indexes from given collection dataType

        ArrayList<String> list2 = new ArrayList<>();
                list2.addAll(Arrays.asList("A", "B","C", "D", "E"));

//                                       index#:      0  1  2  3  4
        System.out.println( list2 );              // [A, B, C, D, E]

        Collections.swap(list2,1,2);  // [A, C, B, D, E]

        System.out.println(list2);

        Collections.swap(list2, 0, list2.size()-1); // [E, C, B, D, A]

        System.out.println(list2);

     // frequency() :

        ArrayList<Character> charList = new ArrayList<>();
                charList.addAll(Arrays.asList('A', 'B','C', 'A', 'A','A', 'C'));

        int count = Collections.frequency( charList, 'A');

        System.out.println( count );  // 4

    }
}
