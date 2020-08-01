package day24_Arrays;

import java.util.Arrays;

/*
 write a program that can combine two arrays of integers and
  then print out the maximum number

    Ex:
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}

        output:
            arr3 = {1,2,3,4,5,6,7,8}
            max: 8

 */
public class CombineArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++){
            arr3[arr1.length+i] = arr2[i];
        }

        Arrays.sort(arr3);

        System.out.println("Max: " + arr3[arr3.length-1] );
        System.out.println("Min: " + arr3[0] );
    }
}
