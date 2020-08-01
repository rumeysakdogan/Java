package day31_Recap;

public class Methods_Practice {

    public static void main(String[] args) {
        max(10,20);

        int max = max2(10,20);
        System.out.println( max * 10 );

        System.out.println(  Math.max(10,20) );
    }

    public static void max(int a, int b){
        int max = a > b ? a : b;
        System.out.println(max+" is maximum");
    }

    public static int max2(int a, int b){
        return a > b ? a : b;
    }

}
