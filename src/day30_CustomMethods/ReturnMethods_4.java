package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethods_4 {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int a2[] = {4, 5, 6};
        int[] a3 = combine2Arrays(a1, a2);

        System.out.println(  combine2Arrays(a1, a2)[0]   );
        System.out.println( Arrays.toString(a3) );
    }

    public static int[] combine2Arrays(int[] arr1, int[] arr2){

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

        return arr3;
    }
}
