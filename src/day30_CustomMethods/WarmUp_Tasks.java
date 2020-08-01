package day30_CustomMethods;

import java.util.Arrays;

/*
Warm-up tasks:
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop

 */
public class WarmUp_Tasks {
    public static void main(String[] args) {

        maxNum(17,17);

        int arr2[] = {110,-1,0,9,20,-30,5,61,17};
        printDesc(arr2);
        printDesc( new int[]{10,-1,0,9,20,30,5,6,7} );

        int arr1[] ={10,-1,0,9,20,-30,5,6,-7};
        combine2Arrays(arr1,arr2);

        for (int each : arr1){
            posNegZero(each);
        }
    }

    // task01:
    public static void maxNum(int a,int b){
        if ( a == b){
            System.out.println("equal");
            return;
        }
        if (a > b){
            System.out.println(a+" is maximum");
        }else{
            System.out.println(b+" is maximum");
        }
    }

    // task02:
    public static void printDesc(int[] arr){

        Arrays.sort(arr);

        for (int i = arr.length-1; i >= 0; i--){
            System.out.print( arr[i]+" " );
        }
        System.out.println();
    }

    // task03:

    public static void combine2Arrays(int[] arr1, int[] arr2){

        int arr3[] = new int[arr1.length + arr2.length];

        int k = 0;
        for (int each : arr1){
            arr3[k] = each;
            k++;
        }

        for (int each : arr2){
            arr3[k] = each;
            k++;
        }

        System.out.println(Arrays.toString(arr3));
    }

    // task04:

    public static void posNegZero(int n){

        if (n > 0){
            System.out.println(n+" is positive");
        }else if (n < 0){
            System.out.println(n + " is negative");
        }else{
            System.out.println(n+" is zero");
        }

    }
}
