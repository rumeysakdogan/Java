package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass_Practice {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        Integer[] arr2 = {1, 2, 3, 4};
        for (Integer each : arr2){
            System.out.print(each+" ");
        }

        System.out.println();

        Double arr3[]  = {1.2, 45.9, 40.3, 34.6}; // it only accepts decimals

        for (Double each : arr3){
            System.out.println(each);
        }

        char[] arr5 = {65, 67, 68, 69};
        System.out.println( Arrays.toString(arr5) );

        char ch = 79;
        Character ch2 = 79; // O

        System.out.println( ch2 );


        String[] nums1 = {"12", "13", "14", "15"};

        double[] nums2 = new double[nums1.length];

        for (int i = 0; i < nums1.length; i++){
            nums2[i] = Double.parseDouble( nums1[i] );  // [12.0, 13.0, 14.0, 15.0]
        }

        System.out.println( Arrays.toString( nums2 ));
    }
}
