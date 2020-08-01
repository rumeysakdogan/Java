package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass {

    public static void main(String[] args) {

        Integer num = 100; // not a primitive, it is a wrapper class dedicated for ints
                          // it does not take any primitive except int, no implicit casting.

        int a = 100;

        byte t = 100;
        int z = t;

        Byte b1 = 50;
        int n1 = b1;  // primitives are not loyal like wrapper classes. you can apply casting.

        byte b2 = 40;
      //  Integer n2 = b2;  not allowed

        Integer n3 = new Integer(123); // you can create an object from a wrapper class

        double[] arr = new double[3];
// default values  ===> for int: [0, 0, 0] , for double: [0.0, 0.0, 0.0]

        Double[] arr2 = new Double[3];
// default values for all wrapper classes ===> [null, null, null]
        System.out.println(Arrays.toString( arr2 ));

        int p1 = 300;
        Integer p2 = p1; // converting primitive to its wrapper class is called autoboxing

        Short s1 = 34;
        short s2 = s1; // converting wrapper class to its primitive is called unboxing


        Double[] a1 = {123.0, 4.5, 6.8, 11.2};
        for (Double each : a1){
            System.out.print(each+" ");
        }
    }
}
