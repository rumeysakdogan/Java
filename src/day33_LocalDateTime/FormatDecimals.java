package day33_LocalDateTime;

import java.text.DecimalFormat;

public class FormatDecimals {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00"); // if you want 2 decimal after given num after . put two zeros

        double a = 22/7.0;    // 3.14
        System.out.println(a);

        System.out.println( df.format(a) );

        double f = 6.6666666789;

        System.out.println( df.format(f) );  //6.67
    }
}