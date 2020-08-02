package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        // containsAll(collectionType): checks the given list elements are contained in the arraylist or not

        ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4));

        boolean r1 = list.contains(1); // true

        ArrayList<Integer> element = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,4));

        boolean r2 = list.containsAll(element);

        System.out.println(r2);  // true

        System.out.println("=====================================");

        // addAll( collectionType) : add multiple elements at the same time to arraylist

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

        System.out.println("================================================");

        // removeAll( collectionType): removes all matching elements

        ArrayList<Integer> nums = new ArrayList<>();
            nums.addAll( Arrays.asList(1, 1, 1, 1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13));

        System.out.println(nums);           // [1, 1, 1, 1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13]

        nums.removeAll( Arrays.asList(1, 2, 5, 10, 11) );

        System.out.println(nums);           //  [3, 4, 6, 7, 8, 9, 12, 13]

        System.out.println("================================================");

        // retainAll( collectionType): removes all NON-matching elements

        ArrayList<Integer> num1= new ArrayList<>();
            num1.addAll( Arrays.asList(1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8 , 8, 9 , 9) );

        System.out.println(num1);           // [1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9]

        // only keep the elements that are either 1 or 2 or 3 or 9

        num1.retainAll( Arrays.asList(1, 2, 3, 9));

        System.out.println(num1);           // [1, 1, 2, 2, 3, 3, 3, 9, 9]

    }
}
