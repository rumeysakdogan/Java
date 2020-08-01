package day33_LocalDateTime;

import java.util.Arrays;

/*
   Task01:
        1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals

        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals
 */
public class Calculate {
    public static void main(String[] args) {

        int a = 10;
        double b = 20;

        System.out.println( sum(a,b) );

        float num1 = 10.5f;
        float num2 = 9;

        System.out.println( sum(num1,num2) );              // uses method2
        System.out.println( sum( (int)num1, (int)num2) );  // uses method1

        int[] arr1 = {4,2,1,3};
        Arrays.sort(arr1);              // sort is a overloaded method

        char arr2[] = {'C', 'B', 'A'};
        Arrays.sort(arr2);

        System.out.println("cybertek");  // println is a overloaded method
        System.out.println('c');
        System.out.println(125);
        System.out.println(10.3);

        long l1 = 100;
        long l2 = 200;

        System.out.println( product(l1,l2) );

    }

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

}
