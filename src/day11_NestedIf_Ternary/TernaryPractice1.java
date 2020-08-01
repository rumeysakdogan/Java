package day11_NestedIf_Ternary;
/*
    second task: "can vote" or "Cannot vote"

    third task: write a program that can check if two numbers are equal or not.
 */
public class TernaryPractice1 {

    public static void main(String[] args) {

        int age =21;
        String citizen = "USA";

        String result = "";

        if(age >= 18 && citizen == "USA"){
            result = "Can VOTE!";
        }else{
            result = "Cannot VOTE!";
        }
        System.out.println(result);

        System.out.println("========================");

        String result2 = (age >= 18 && citizen == "USA") ? "Can VOTE!" : "Cannot VOTE!";
        System.out.println(result2);

        System.out.println("========================");

        int num1 = 24;
        int num2 = 34;

        String equal=(num1 == num2) ? "Equal" : "Not Equal";
        System.out.println(equal);


    }
}
