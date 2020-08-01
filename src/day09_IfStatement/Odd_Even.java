package day09_IfStatement;

public class Odd_Even {

    public static void main(String[] args) {

        int number = 768908;

        boolean even = number%2 == 0;

        if(even){
            System.out.println(number+" is even");
        }else{
            System.out.println(number+" is odd");
        }
    }
}
