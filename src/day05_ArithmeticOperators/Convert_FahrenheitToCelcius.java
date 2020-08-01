package day05_ArithmeticOperators;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
     Write a Java program to convert Fahrenheit to Celcius F=9*C/5+32
 */
public class Convert_FahrenheitToCelcius {

    public static void main(String[] args) {

        double C,F;
        C = 32.3;
        F = 9*C/5+32;

        System.out.println(F);
    }
}
