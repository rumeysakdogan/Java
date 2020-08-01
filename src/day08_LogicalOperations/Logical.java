package day08_LogicalOperations;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class Logical {

    public static void main(String[] args) {

        // !: opposite boolean
        boolean r1= 9 > 7; // true
        boolean r2 = !r1; // false

        System.out.println(r1 + " : "+r2);

        System.out.println( ! false);
        System.out.println(!true);

        boolean r3 = !false == true;
        System.out.println(r3);

        boolean r4 = true == !true;
        System.out.println(r4);

        boolean r5 = 9 > 7 && 9 > 10;
                    // true  && false
                    // false
        System.out.println(r5);

        boolean r6 = !true && false;
                    // false
        boolean r7 = !true && 9 > 8;
                    // true

        boolean r8 = true == !false   || false == true;

        System.out.println(r8);

        boolean r9 = !false == false  || true == !false;

        System.out.println(r9);








    }
}
