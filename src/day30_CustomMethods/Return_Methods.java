package day30_CustomMethods;

public class Return_Methods {

    public static void main(String[] args) {
        addition1(4,5);

        int n = addition2(4,7);
        System.out.println(n);

        System.out.println( addition2(3,4) * 2 );
    }

    public static void addition1(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static int addition2(int a, int b){
        return a+b;
    }
}
