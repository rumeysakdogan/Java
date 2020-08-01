package day06_ComparisonOperators;

public class Swap2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        b = a + b;
        a = b - a;
        b = b- a ;

        System.out.println(a);
        System.out.println(b);
    }
}
