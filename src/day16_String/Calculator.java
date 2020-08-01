package day16_String;

import java.util.Scanner;

/*
write a program to ask the user enter two number and a math operator.
        ex:
            10
            20
            *
        output:
            200
            10
            2
            /
        output:
            5
    valid math operators are: *, / , +, -, %
    Nested If
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter enter two numbers: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();

        System.out.println("Please enter a math operator: ");
        char operator = in.next().charAt(0);

        boolean validOperator = (operator == '+') || (operator == '-') || (operator == '*')
                || (operator == '/') || (operator == '%');

        double result = 0;

        if(validOperator){
            if(operator == '+'){
                result = num1 + num2;
            }else if(operator == '-'){
                result = num1 - num2;
            }else if(operator == '*'){
                result = num1 * num2;
            }else if(operator == '/'){
                result = num1 / num2;
            }else{
                result = num1 % num2;
            }
        }else{
            System.out.println("Not valid math operator!");
        }
        System.out.println(result);
    }
}
