package day51_Exceptions;

class B{

    public B(){
        System.out.println("Super class' default constructor");
    }
}


public class SuperKeyword2 extends  B{
// It is mandatory to call super class' constructor for subclasses.

    public SuperKeyword2(){
        // super(); this is done implicitly only if the superclass' constructor is default.
        // Otherwise we need to call it manually with super();
        System.out.println("Sub class' default constructor");
    }

    public static void main(String[] args) {
        new SuperKeyword2();
    }

}
