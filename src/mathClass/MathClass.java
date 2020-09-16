package mathClass;

public class MathClass {
    public static void main(String[] args) {
        // 10 * 10 * 10

        double r1 = Math.pow(10,3);

        System.out.println(r1);

        // 2*2*2*2*2

        System.out.println( Math.pow(2,5));

        // |-1| ==> 1
        System.out.println( Math.abs(-1) );

        System.out.println( Math.sqrt(25) );
        System.out.println( Math.PI);  //final variables are written by capitals
        System.out.println( Math.E);

        System.out.println( Math.sin(30));

        System.out.println( Math.min(100,200));
        System.out.println( Math.max( 56.9, 768.2));
        System.out.println( Math.random());

    }
}
