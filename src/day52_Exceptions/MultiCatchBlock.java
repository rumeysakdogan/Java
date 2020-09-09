package day52_Exceptions;

public class MultiCatchBlock {

    public static void main(String[] args) {

        int[] arr = {10,20};

        // when you are giving multi-catch block one rule:
        // parent exception class cannot be placed before the child exception
        // whenever we have a unchecked exception, give Run Time Exception in catch block
        // whenever we have a checked exception, give Exception in the catch block to handle
        try{
            System.out.println( arr[20]); // ArrayIndexOutOfBound

        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception is handled.");

        }catch(ClassCastException e){
            System.out.println("Class Cast Exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound exception");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound exception");
        }catch (RuntimeException e){
            System.out.println("Run Time Exception");
        }catch (Exception e){
            System.out.println("Exception");
        }

        // at the end only one of them gets executed

        System.out.println("================================");
        String str = "Cybertek";
        try{
            System.out.println( str.charAt(200));
        }catch(RuntimeException e){
            System.out.println( e.getMessage());
        }

        System.out.println("================================");
        try {
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println( e.getMessage());
        }

        System.out.println("Completed");

        System.out.println("================================");
    try{
        System.out.println( 8/0 ); // ArithmeticException
        System.out.println("Try Block");
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Catch Block");
    }finally {
        System.out.println("Finally");
    }

    // finally block is always executed.Even if the exception is not handled.

    }
}
