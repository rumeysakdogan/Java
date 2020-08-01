package day23_Arrays;
/*
Create an array that holds 12 months names
User should be able to enter month index and output should be:
“The month name is <MonthName>”

Create an array that holds the days
User should be able to enter the day index and output should be:
“Today is Monday”
 */
import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April" , "May",
                "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("Please enter a number between 1 to 12:");

        int index = scan.nextInt();

        System.out.println("The month name is "+months[index-1]);

        System.out.println("===============================================");

        
    }
}
