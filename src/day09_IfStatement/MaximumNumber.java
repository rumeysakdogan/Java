package day09_IfStatement;

public class MaximumNumber {

    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 3.9;
        double num3 = 1.3;

        boolean num1IsMax = num1 > num2 && num1 > num3;
        boolean num2IsMax = !num1IsMax && num2 > num3;
        boolean num3IsMax = !num1IsMax && !num2IsMax;
            // num1IsMax == false && num2IsMax == false
            //      !num1IsMax    &&     !num2IsMax

        double max = 0; // we want to assign the maximum number to variable max

        if(num1IsMax){
            //System.out.println(num1);
            max = num1;
        }
        if(num2IsMax){
            //System.out.println(num2);
            max = num2;
        }
        if(num3IsMax){
            //System.out.println(num3);
            max = num3;
        }

        System.out.println("The maximum number is: "+max);

// my code:
//        if(num1 > num2 && num1 > num3){
//            System.out.println("The maximum number is: "+num1);
//        }
//        if(num2 > num1 && num2 > num3){
//            System.out.println("The maximum number is: "+num2);
//        }
//        if(num3 > num1 && num3 > num2){
//            System.out.println("The maximum number is: "+num3);
//        }

    }
}
