package day52_Exceptions;

public class ThrowsPractice {

    public static void main(String[] args) throws InterruptedException{

        m1();
        m2();
    }

    public static void m1() throws InterruptedException{
        Thread.sleep(3000); // advantage: more readable, less code
        // disadvantage whoever calls it that person needs to handle, temporary solution
        // if you call the method just once throws is useful like main method
    }

    public static void m2() throws InterruptedException{
        m1();
    }

    public static void m3(){
        try{
            m2();
        }catch (InterruptedException e){}
    }

    public static void m4(){
        m3(); // try&catch is permanent solution
        // but if you use in custom method in utility, useful one is try&catch
    }
}
