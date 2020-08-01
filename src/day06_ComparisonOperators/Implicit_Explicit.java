package day06_ComparisonOperators;

public class Implicit_Explicit {

    public static void main(String[] args) {

        short s1 = 100;
        long l1 = s1; // implicit casting: automatically done

        long l2 = (long)s1; //implicit casting: manually done

        int I1 = 300;
        double D1 = I1;

        double d1 = 400.5555555;

        int i1 = (int)d1;
        System.out.println(d1);
        System.out.println(i1);

        int n1 = 1000;
        byte b1 = (byte)n1;
        System.out.println(b1); //-24
    }
}
