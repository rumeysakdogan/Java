package day33_LocalDateTime;

import java.util.Arrays;

/*
 Task02:
        1. create a return method that can return an int array in descending order
        2. create a return method that can return a double array in descending order
        3. create a return method that can return a String array in descending order
        4. create a return method that can return a char array in descending order
 */
public class SortDescending {

    public static void main(String[] args) {

        int[] arr = {11, 20, 3, 0, 40, 5, 7, -2};

        arr = sortDescending(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("================================");

        double arr2[] = {2.3, 0.9, 13.4, 5.6, 0, -0.3};

        arr2 = sortDescending(arr2);

        System.out.println(Arrays.toString(arr2));

        System.out.println("================================");

        String s[] = {"A", "Z", "V", "C", "Y", "E"};

        s = sortDescending(s);

        System.out.println(Arrays.toString(s));
    }

    public static int[] sortDescending(int[] arr){

        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];

        int k = arr.length-1;
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static double[] sortDescending(double[] arr){

        Arrays.sort(arr);
        double[] arr2 = new double[arr.length];

        int k = arr.length-1;
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static String[] sortDescending(String[] arr){

        Arrays.sort(arr);
        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static char[] sortDescending(char[] arr){

        Arrays.sort(arr);
        char[] arr2 = new char[arr.length];

        int k = arr.length-1;
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

}
