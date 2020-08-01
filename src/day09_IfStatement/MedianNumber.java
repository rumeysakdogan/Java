package day09_IfStatement;
/*
write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
 */
public class MedianNumber {

    public static void main(String[] args) {

            double num1 = 5;
            double num2 = 70;
            double num3 = 6;

            boolean num1IsMed = (num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2);
            boolean num2IsMed = (num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1);
            boolean num3IsMed = !num1IsMed && !num2IsMed;

            double median = 0;

            if (num1IsMed){
                median = num1;
            }if(num2IsMed){
                median = num2;
            }if(num3IsMed){
                median = num3;
            }

        System.out.println("The median number is: "+median);

//            if((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)){
//                System.out.println("The median number is: "+num1);
//            }
//            if((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)){
//                System.out.println("The median number is: "+num2);
//            }
//            if((num3 < num1 && num3 > num2) || (num3 > num1 && num3 < num2)){
//                System.out.println("The median number is: "+num3);
//            }
    }
}
