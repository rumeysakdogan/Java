package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
            list.addAll( Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6, 7, 7));

/*              DO NOT USE REMOVE METHOD IN THE LOOP UNTIL WE LEARN ITERABLES:

            remove all numbers that are less than 5


        for (int i = 0; i < list.size(); i++){

            if ( list.get(i) < 5 ){
                list.remove(i);
            }
        }

        System.out.println(list);

*/

    }
}
