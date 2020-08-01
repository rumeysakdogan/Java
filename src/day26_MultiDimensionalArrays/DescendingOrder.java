package day26_MultiDimensionalArrays;

import java.util.Arrays;

/*
  write a program that can sort the array in descending order
        ex:
            arr1: { 10, 11, 8, 9, 12, 5, 15};
            output:
                arr2: {15, 12, 11, 10, 9, 8, 5}
  NOTE: at the end, you must have an array that contains
             the descending order of the original array
 */
public class DescendingOrder {
    public static void main(String[] args) {

        int[] arr = {2, 1, 3};

        int[] des = new int[arr.length];

        Arrays.sort(arr);

        int k = arr.length-1;

        for (int i = 0; i < des.length-1; i++){
            des[i] = arr[k];
            k--;
        }

//         my approach:
//        for (int i = 0; i < arr.length; i++){
//            des[i] = arr [(arr.length-1)-i];
//        }

        System.out.println(Arrays.toString(des));


    }
}
