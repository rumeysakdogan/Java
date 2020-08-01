package day08_LogicalOperations;
/*
tasks: manually calculate the following code fragments:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y + x / y;
 */
public class Post_VS_Pre {

    public static void main(String[] args) {

        int a = 200;
        int b = -a++ + - --a * a-- % 2;
             // -200 + - 200 * 200 % 2
            //  -200 - 40000 % 2
            //  -200 -0 = -200
        System.out.println(b);

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
         //  300 + 400 - 300 * 400 + 300 / 400
         //  700 - 120000 + 0
        // -119300
        System.out.println(z);


    }
}
