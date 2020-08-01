package day06_ComparisonOperators;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class RelationalOperators {

    public static void main(String[] args) {
        // >
        boolean r1 = 10 > 9;
        System.out.println(r1);

        // <
        boolean r2 = 100 < 9000;
        System.out.println(r2);

        // >=
        boolean r3 = 87 >= 85;
        System.out.println(r3);

        boolean r4 = 877 >= 878;
        System.out.println(r4);

        // <=
        boolean r5 = 200 <=300;
        System.out.println(r5);

        // == : equal
        boolean r6 = 900 == 800;
        System.out.println(r6);

        boolean r7 = true ==false;
        System.out.println(r7);

        boolean r8 = "Muhtar" == "Good Guy";

        boolean r9= "muhtar" == "MUHTAR";
        System.out.println(r9);

        // != : not equal

        boolean r11 = "Muhtar" != "Bad Guy";
        System.out.println(r11);

        boolean r12 = true != false;
        System.out.println(r12);

        boolean result1 = 'A' == 65; // characters have their ascii numbers ascii# of A= 65
        System.out.println(result1); // true

        boolean result2 = 100 == 100.0;
        System.out.println(result2);

        boolean result3 = 10 == (int)10.999999;
        System.out.println(result3);

        boolean isEven = (100 % 2 ==0);
        System.out.println(isEven);
    }
}
