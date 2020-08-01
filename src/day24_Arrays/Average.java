package day24_Arrays;

import java.util.Scanner;

/*
3. Write a program that can return the average number from an array of integers
			ex: [1,2,3]
			average: 2

			[10, 15, 5, 6]
			average: 9

			[4, 5, 6, 7, 8, 10, 20, 30, 0]
			average: 10

 */
public class Average {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int n = scan.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
            sum += arr[i];
        }

        System.out.println("Average number is: "+ (double)sum/n);

    }
}
