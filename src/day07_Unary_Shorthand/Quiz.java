package day07_Unary_Shorthand;

public class Quiz {

    public static void main(String[] args) {

        int iNum = 100;
        double dNum = 200;
        float fNum = 300;

         //iNum = fNum
         //iNum = fNum;
        fNum = iNum;
        dNum = fNum;
        //fNum = dNum;
        dNum = iNum;
        // iNum = dNum;

        System.out.println("Result A" + 0 + 1); //concatenation
                        // "Result A0" + 1
                        // Result A01
        System.out.println("Result B" + (1) + (2)); // concatenation
                        // "Result B1" + 2
                        // Result B12
        System.out.println("Result B" + (1 + 2));
                        // Result B3

         int x = 3, y=2;
         long z = (x+y)*2/3%2;
        System.out.println(z);
        System.out.println((int)10.0/3);


    }
}
