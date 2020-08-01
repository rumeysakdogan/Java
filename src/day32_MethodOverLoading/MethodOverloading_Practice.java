package day32_MethodOverLoading;
/*
tasks1:
    1. create a method that can find the addition of two numbers
                        addition2Numbers
    2. create a method that can find the addition of three numbers
                        addition3Numbers
    3. create a method that can find the addition of four numbers
                        addition4Numbers

 */
public class MethodOverloading_Practice {

    public static void main(String[] args) {

        sumOf2Numbers(10,20);
        sumOf3Numbers(10,20,30);
        sumOf4Numbers(10,20,30,40);

        System.out.println("============================");

        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40);

    }


    public static int sumOf2Numbers(int a, int b){
        return a+b;
    }

    public static int sumOf3Numbers(int a, int b, int c){
        return a+b+c;
    }

    public static int sumOf4Numbers(int a, int b, int c, int d){
        return a+b+c+d;
    }

//=============================================================================

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }


}
