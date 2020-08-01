package day09_IfStatement;

public class MinimumNumber {
    public static void main(String[] args) {

        double num1 = 50;
        double num2 = 7;
        double num3 = 13;

        boolean num1IsMin = num1 < num2 && num1 < num3;
        boolean num2IsMin = !num1IsMin && num2 < num3;
        boolean num3IsMin = !num1IsMin && !num2IsMin;

        double min = 0;

        if(num1IsMin){
            min = num1;
        }
        if(num2IsMin){
            min = num2;
        }
        if(num3IsMin){
            min = num3;
        }

        System.out.println("The minimum number is: "+min);

//my code:
//        if (num1 < num2 && num1 < num3) {
//            System.out.println("The minimum number is: " + num1);
//        }
//        if (num2 < num1 && num2 < num3) {
//            System.out.println("The minimum number is: " + num2);
//        }
//        if (num3 < num1 && num3 < num2) {
//            System.out.println("The minimum number is: " + num3);
//        }
    }
}