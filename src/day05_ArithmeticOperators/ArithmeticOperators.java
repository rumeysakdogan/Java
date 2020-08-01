package day05_ArithmeticOperators;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println( 20 + 3 - 2 + 1);
                            //  23 - 2 +1
                            //  21 + 1
                            //  22

        System.out.println( 20 * 3);

        System.out.println( 2 + 3 - 1 * 4 );
                            //  2 + 3 - 4
                            // 5 - 4
                            //   1
        System.out.println( 10/3 ); // int/int => int
        System.out.println(10.0/3); // double/int => double
        System.out.println(10.0/3.0); //double/double => double


        System.out.println((5 + 2) * 4); // 28
        System.out.println( 10 / (5 - 3)); // 5
        System.out.println(8 + 12 * (6 - 2)); // 56
        System.out.println((4 + 17) % 2 -1); // 0
        System.out.println((6 - 3) * (2 + 7) / 3); // 9
        System.out.println(10%4); // 2

    }
}
