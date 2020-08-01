package day03_sequences_Variables;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
declare variables:
        Datatype variableName = Data;
 */
public class Variables
{
    public static void main(String[] args)
    {
        // length: 2, width: 4, area: 8

        byte length = 11;
        byte width = 12;
        System.out.println( length * width );

        // 140
        // byte num1 = 140; (byte ranges between -128 to 127)

        short num2 = 140;

        // 40000
        // short salary = 40,000

        int salary = 40000;

        // int salary = 99999999999;

        long largeNumber = 99999999999l; // either l or L

        // PI = 3.14

        double PI = 3.14;   // compiler prefers double for decimals
        System.out.println(PI);

        float decimal1 = 3.14F;
        System.out.println(PI);





    }


}
