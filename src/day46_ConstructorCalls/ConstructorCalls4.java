package day46_ConstructorCalls;

public class ConstructorCalls4 {

    public ConstructorCalls4(){
        //this();

    }

    public ConstructorCalls4(int a){
        //this(2.5); // contains constructor with double arg
    }

    public ConstructorCalls4(double a){
        //this(10);  //Constructor cannot call itself, also cannot contains itself
        this();
    }


}
