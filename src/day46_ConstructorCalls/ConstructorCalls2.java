package day46_ConstructorCalls;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("A");
    }

    public ConstructorCalls2(int a){

        //ConstructorCalls2();

        // you cannot call constructor by its name, you need to use this() keyword to call it.
        // since we did not give any parameters it will call the default one with no-arg.
        this();
        System.out.println("B");
    }

    public ConstructorCalls2(String str){
        this(10);
        System.out.println("C");
    }

    public ConstructorCalls2(char c){
        this();    // MUST be at the first step!
        System.out.println("D");
    }

    public ConstructorCalls2(double a){
        System.out.println("E");
       // this(10);    if you want to call a constructor, it has to be written "at the first step"
    }

    public static void main(String[] args) {

        new ConstructorCalls2('c');

    }




}
