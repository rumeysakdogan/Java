package day53_FinalKeyword;

public class BreaktimeException extends RuntimeException{  // custom unchecked exception


    public BreaktimeException() {
        super("It is time for a break");
        System.err.println("Time to take 15 minutes break");  // sys.out -> sys.err it will print in red color
    }

    public BreaktimeException(String str){
        super(str);
        System.err.println("Time to take 15 minutes break");
    }
}
class Tets{
    public static void main(String[] args) {

      /// throw new RuntimeException("This is Runtime Exception");
        throw new BreaktimeException("You need to give us a break");

      //  System.out.println("Test Completed!");
    }
}