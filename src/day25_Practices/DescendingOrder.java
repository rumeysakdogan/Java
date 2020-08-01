package day25_Practices;

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

        int[]  arr1 =  { 10, 11, 8, 9, 12, 5, 15};

        int[]  arr2 = new int[arr1.length];

        Arrays.sort(arr1);

        for (int i = arr1.length-1; i >= 0; i--){
            arr2[(arr1.length-1)-i] = arr1[i];
        }
        
        System.out.println(Arrays.toString(arr2));
    }
}
