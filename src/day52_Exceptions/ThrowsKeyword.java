package day52_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException{
        method1(); // throws is a temporary solution
        method2(); // try-catch actually handles the exception
        method3();
    }
    public static void method1() throws InterruptedException{
        Thread.sleep(3000);
    }

    public static void method2(){

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){}

    }

    public static void method3() throws InterruptedException {
        method1();
    }

}
