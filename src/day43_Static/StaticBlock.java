package day43_Static;

public class StaticBlock {



// static block always run first!
    static{
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
