package day29_CustomMethods;

import java.util.Scanner;

/*
    4. check eligibility to vote
    5. check eligibility to buy alcohol
    5. calculate result from num1 and num2 and operator
 */
public class Eligibility {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        eligibleToVote("John",21,true,"Trump");

        eligibleToBuyAlcohol(true,19);

        calculator(12, '*',10);

        calculator(scan.nextInt(), scan.next().charAt(0),scan.nextInt());
    }

    public static void eligibleToVote(String name,int age, boolean citizen, String candidateName){

        boolean eligibleToVote = age >= 18 && citizen == true;
        if ( eligibleToVote ) {
            System.out.println(name+" is eligible to vote for "+candidateName);
        } else {
            System.out.println(name+" is not eligible to vote for "+candidateName);
        }

    }

    public static void eligibleToBuyAlcohol(boolean hasID, int age){

        boolean eligible = hasID && age >= 21;

        if (!eligible){
            System.out.println("You are not eligible to buy alcohol");
            return;
        }
            System.out.println("You are eligible to buy alcohol");
    }

    public static void calculator(double num1, char operator, double num2) {

        // +, -, *, / , %

//        switch (operator){
//            case '+':
//                System.out.println(num1 + num2);
//                break;
//            case '-':
//                System.out.println(num1 - num2);
//                break;
//            case '*':
//                System.out.println(num1 * num2);
//                break;
//            case '/':
//                System.out.println(num1 / num2);
//                break;
//            case '%':
//                System.out.println(num1 % num2);
//                break;
//            default:
//                System.out.println("Invalid operator!");
//        }

        String result = "";

        result += (operator == '+') ? (num1 + num2) : (operator == '-') ? (num1 - num2) :
                (operator == '*') ? (num1 * num2) : (operator == '/') ? (num1 / num2) :
                        (operator == '%') ? (num1 % num2) : ("Invalid operator!");

        System.out.println(result);
    }

}
