package day07_Unary_Shorthand;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Unary {

    public static void main(String[] args) {

        System.out.println(-1 + -10);
                        //   -1 - 10 = -11

        System.out.println(-11 -  -10);
                        //   -11 + 10 = -1

        //  --: decrement
            int a = 20;
           // a = a-1; // 19
            --a;
            System.out.println(a);

        // ++: increment
            int b =  10;
          // b = b + 1;  // 11
            ++b;
            System.out.println(b);

        // pre:
            int x = 100;

            System.out.println( ++x );  // 101

            int y = 200;

            System.out.println( --y );  // 199


    }

}
