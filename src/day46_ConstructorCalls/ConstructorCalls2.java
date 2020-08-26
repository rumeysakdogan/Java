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
        this();
        System.out.println("D");
    }

    public static void main(String[] args) {

        new ConstructorCalls2('c');

    }




}
