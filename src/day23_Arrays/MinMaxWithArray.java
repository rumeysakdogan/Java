package day23_Arrays;

// write a program that can return the min and max from the array

public class MinMaxWithArray {
    public static void main(String[] args) {


        int[] arr = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++ ){
            if ( max < arr[i] ){
                max = arr[i];
            }else{
                min = arr[i];
            }
        }

        System.out.print("Max is: "+max+"\nMin is: "+min);


    }
}
