package day03_sequences_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Variables_Practice
{
    public static void main(String[] args) {
        // 100, 200
        int num1 = 100;
        int num2 = 200;
        int sum = num1 + num2;

        System.out.println(sum);


        float num3 = 3.5f;

        double a = num3;

        // long b = num3;

        long x = 100;
        float y = x;
        double z = x;

        System.out.println(x); //100
        System.out.println(y); //100.0
        System.out.println(z); //100.0

        // int p = 3.5;

        float f = 100;
        float f2 = 100.0f;

        System.out.println(f);
        System.out.println(f2);
    }



}
