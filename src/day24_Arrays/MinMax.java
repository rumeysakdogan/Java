package day24_Arrays;

import java.util.Scanner;

/*
 write a program that asks user how many numbers he wants to enter,
  and get all the user inputs and store them into an array variable,
  and then write the program that can return maximum and minimum numbers


 */
public class MinMax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter:");
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
          System.out.println("Enter a number:");
          arr[i] = scan.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }

        System.out.printf("Max is: %d\nMin is: %d",max,min);
    }
}
