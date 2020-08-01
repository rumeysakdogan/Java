package day24_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        // Arrays.toString(arr):
        // in order to print array variable, we MUST convert it to a string!!
        int[] arr = {1, 2, 3};      // using this method only to print an array : Arrays.toString(arr)

        System.out.println(Arrays.toString(arr));

        String[] groupMates = {"Agit", "Cihat", "Bulent", "Ibrahim", "Shirzat", "rumeysa", "zeyd"};

        // when you sort a String array, it will print alphabetical order first A-Z then a-z
        //                                                    ascii numbers :  65-90    97-122
        Arrays.sort(groupMates);

        System.out.println(Arrays.toString(groupMates));



        // Arrays.sort(arr):

        int[] nums = { 3, 5, 1, 0, 16, 9, 2};

        System.out.println(Arrays.toString(nums));      // [3, 5, 1, 0, 16, 9, 2]

        Arrays.sort(nums);      // [0, 1, 2, 3, 5, 9, 16]

        System.out.println(Arrays.toString(nums));

        System.out.println( "Max: " + nums[nums.length-1] );
        System.out.println( "Min: " + nums[0] );

        System.out.println("=============================");

        // Arrays.equals( arr1, arr2 ) :    returns boolean (true or false)

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals( arr1, arr2 );

        System.out.println(r1);

        int[] arr3 = {2,3,1};

        boolean r2 = Arrays.equals( arr2, arr3 );

        System.out.println(r2);

        Arrays.sort(arr2);  // arr2: 1, 2, 3
        Arrays.sort(arr3);  // arr3: 1, 2, 3

        boolean r3 = Arrays.equals( arr2, arr3 );

        System.out.println(r3);
    }
}
