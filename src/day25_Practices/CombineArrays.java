package day25_Practices;

import java.util.Arrays;

/*
write a program that can combine two arrays of integers and then print out the maximum number
    Ex:
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}
        output:
            arr3 = {1,2,3,4,5,6,7,8}
            max: 8

 */
public class CombineArrays {
    public static void main(String[] args) {

        int[] arr1 = { 1,2,3,4};
        int[] arr2 = {5,6,7,8};

        int[] arr3 = new int[arr1.length+arr2.length];

        int i = 0;

        for (int each : arr1){
            arr3[i] = each;
            i++;
        }

        for (int each : arr2){
            arr3[i] = each;
            i++;
        }

        Arrays.sort(arr3);

        System.out.println("Max is: "+ arr3[arr3.length-1]);

    }
}
