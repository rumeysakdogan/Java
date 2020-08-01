package day12_Switch_Scanner;

import java.util.Scanner;

public class UserInput_Practice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
//
//        int num = scan.nextInt();
//
//        String result =(num%2 == 0) ? num+ " is even" : num+" is odd";
//
//        System.out.println(result);

       // System.out.println("=================");

        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double sum = num2+num3;

        System.out.println("Sum of "+num2+" "+num3+" is: "+sum);

    }
}
