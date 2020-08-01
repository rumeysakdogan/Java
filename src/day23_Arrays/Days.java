package day23_Arrays;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        String[] days = new String[7];

        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        for ( String i : days){
            System.out.print(i+" ");
        }

        System.out.println("\n============================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7: ");
        int index = scan.nextInt();

        System.out.println("Today is "+days[index-1]);
    }
}
