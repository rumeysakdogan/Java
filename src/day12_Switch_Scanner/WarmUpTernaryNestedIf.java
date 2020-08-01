package day12_Switch_Scanner;
/*
  1. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
            NOTE: DO NOT USE IF STATEMENT
   2. write a program that can define the age groups of a person
        age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF
 */
public class WarmUpTernaryNestedIf {
    public static void main(String[] args) {

        double n1 = -4;
        double n2 = 15;
        double n3 = 8;

        boolean n1max = n1>n2 && n1>n3;
        boolean n2max = n2>n3 && !n1max;

        String max =(n1max) ? "n1 is bigger" :(n2max) ? "n2 is bigger" : "n3 is bigger";

        System.out.println(max);

        System.out.println("=====================");

        int age = 0;
        boolean validAge = age >=0 && age <=150;
        String result = "";

        if(validAge){

            result = (age<21) ? "Teenager" :(age<55) ? "Adult" : "Senior";
            
//            if(age<21){
//                result = "Teenager";
//            }else if(age<55){
//                result = "Adult";
//            }else{
//                result = "Senior";
//            }
        }else{
            result = "Invalid age";
        }

        System.out.println(result);
    }
}
