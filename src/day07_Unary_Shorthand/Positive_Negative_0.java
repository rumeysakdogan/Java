package day07_Unary_Shorthand;

public class Positive_Negative_0 {

    public static void main(String[] args) {
        int number = 13;

        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = number == 0;

        System.out.println(number+ " is a positive number? "+positive);
        System.out.println(number+ " is a negative number? "+negative);
        System.out.println(number+ " is a zero? "+zero);


    }
}
