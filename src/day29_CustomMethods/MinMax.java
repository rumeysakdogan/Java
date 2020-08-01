package day29_CustomMethods;
/*
11. write a method that can print out the maximum number from any array of integers
12. write a method that can print out the minimum number from any array of integers

 */
public class MinMax {

    public static void main(String[] args) {

        int[] arr = {100, -10, 22, 13, 3, 45, 678, -1000};

        max(arr);
        min(arr);
    }

    public static void max(int[] arr){

        int max = arr[0];


        for (int each : arr){
            if ( each > max){
                max = each;
            }
        }

        System.out.println("Max: "+max);
    }

    public static void min(int[] arr){

        int min = arr[0];

        for (int each : arr){
            if (min > each){
                min = each;
            }
        }

        System.out.println("Min: "+min);
    }

}
