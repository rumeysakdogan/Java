package day07_Unary_Shorthand;

public class Post_VS_Pre {

    public static void main(String[] args) {

        int g = 10;
        System.out.println(++g); // 11
        System.out.println(g);  // 11

        System.out.println("===============");

        int b = 10;
        System.out.println(b++);
        System.out.println(b);

        System.out.println("================");

        int c = 25;
        int d = c++; // d=25

        // c=26
        System.out.println(d);
        System.out.println(c);

        System.out.println("================");

        int x = 8;
        int y = x--; // y=8
        System.out.println(y);
        System.out.println(x);

            int a = 1;
            a = -a-- + a++ / -a-- * --a;
        // a = -1 + 0 / -1 * -1
        // a = -1  + 0 * -1
        // a = -1  + 0
        // a = -1
        System.out.println(a);

            int p = 50;
            p = --p + p++ + p-- + p++;
        System.out.println(p);

        int n = 4;
        int m = n * 4 - n++;
        System.out.println(m);

    }

}
