package day32_MethodOverLoading;

import java.util.Scanner;

/*
2. write a return method that accepts two numbers and an operator,
then returns calculation result.
             if the operator is invalid, return zero
             otherwise return the result

 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      double result = calculator(scan.nextDouble(), scan.next().charAt(0), scan.nextDouble());

        System.out.println("The result is: "+ result );
    }

    public static double calculator(double a, char c, double b){
        return (c == '+') ? a+b :(c == '-') ? a-b :(c == '*') ?
                a*b :(c == '/') ? a/b :(c == '%') ? a%b : 0;
    }
}
