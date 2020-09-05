package day51_Exceptions;

public class ExceptionHandling2 {

    public static void main(String[] args) {

        String exceptionMessage = "";


        try{
            System.out.println( 10/0 );
        }catch(ArithmeticException e){
            exceptionMessage = e.getMessage();
            System.out.println("ArithmeticException is detected");
        }

        System.out.println(exceptionMessage); // put the print statement outside of try&catch block

    }
}
