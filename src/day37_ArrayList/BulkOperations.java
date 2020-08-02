package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4));

        boolean r1 = list.contains(1); // true

        ArrayList<Integer> element = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,4));

        boolean r2 = list.containsAll(element);

        System.out.println(r2);  // true

        System.out.println("=====================================");

        ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(2);
            list2.add(3);
            list2.add(4);

        boolean bool = list2.containsAll(  Arrays.asList(10,20,4)  );   // false

        Integer[] arr =  {5,6,7};

        boolean bool2 = list2.containsAll( Arrays.asList( arr) );
        System.out.println(bool);

        System.out.println("================================================");

        ArrayList<Integer> numbers = new ArrayList<>();
            numbers.addAll( Arrays.asList(30, 25, 40, 15, 55, 65, 75, 85, 95, 100));

            /*
        add : 30, 25, 40, 15, 55, 65, 75, 85, 95, 100

        Integer[] nums = {30, 25, 40, 15, 55, 65, 75, 85, 95, 100};

        numbers.addAll( Arrays.asList(nums));
            */

    }
}
