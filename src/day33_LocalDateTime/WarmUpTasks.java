package day33_LocalDateTime;

import java.util.Arrays;

/*
    Task01:
        1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals
        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals
    Task02:
        1. create a return method that can return an int array in descending order
        2. create a return method that can return a double array in descending order
        3. create a return method that can return a String array in descending order
        4. create a return method that can return a char array in descending order
    Task03:
        1. create a method that can print out the unique numbers from an array of integer
        2. create a method that can print out the unique numbers from an array of double
        3. create a method that can print out the unique words from an array of String
        4. create a method that can print out the unique characters from an array of chars
 */
public class WarmUpTasks {
    public static void main(String[] args) {

        int[] arr = {-10, 98, 657, 34, 2, -30, 2, 98, 0, 34};
        System.out.println( Arrays.toString( descending(arr)) );
        uniques(arr);
    }

    // Task01:

    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }

    public static int product(int a,int b){
        return a*b;
    }
    public static double product(double a, double b){
        return a*b;
    }

    // Task02:

    public static int[] descending(int[] arr){
        Arrays.sort(arr);
        int arr2[] = new int[arr.length];

        int k = 0;
        for (int i = arr.length-1; i >= 0; i-- ){
            arr2[k] = arr[i];
            k++;
        }
        return arr2;

    }
    public static double[] descending(double[] arr){
        Arrays.sort(arr);
        double arr2[] = new double[arr.length];

        int k = 0;
        for (int i = arr.length-1; i >= 0; i-- ){
            arr2[k] = arr[i];
            k++;
        }
        return arr2;
    }
    public static String[] descending(String[] arr){
        Arrays.sort(arr);
        String arr2[] = new String[arr.length];

        int k = 0;
        for (int i = arr.length-1; i >= 0; i-- ){
            arr2[k] = arr[i];
            k++;
        }
        return arr2;
    }
    public static char[] descending(char[] arr){
        Arrays.sort(arr);
        char arr2[] = new char[arr.length];

        int k = 0;
        for (int i = arr.length-1; i >= 0; i-- ){
            arr2[k] = arr[i];
            k++;
        }
        return arr2;
    }

    // Task03:

    public static void uniques(int[] arr){

        for (int each : arr){
          int count = 0;
          for (int i : arr){
              if (each == i){
                  count++;
              }
          }
          if(count == 1){
              System.out.println(each);
          }
        }
    }
    public static void uniques(double[] arr){

        for (double each : arr){
            int count = 0;
            for (double i : arr){
                if (each == i){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(each);
            }
        }
    }
    public static void uniques(String[] arr){

        for (String each : arr){
            int count = 0;
            for (String i : arr){
                if (each.equals(i)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(each);
            }
        }
    }
    public static void uniques(char[] arr){

        for (char each : arr){
            int count = 0;
            for (char i : arr){
                if (each == i){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(each);
            }
        }
    }
}

