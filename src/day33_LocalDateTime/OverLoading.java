package day33_LocalDateTime;

public class OverLoading {

    public static void main(String[] args) {  // Actual main method with String[] args(this can be other names) will run not the others.
        System.out.println("String array"); // compile recognize this main method to run our code fragments.
    }
/*
    public static void main(String... args) { => this is also acceptable in Java for main method

    }
*/

    public static void main(int[] kfc) {
        System.out.println("int array");
    }

    public static void main(double[] arr) {
        System.out.println("double array");
    }
/*
      overloaded method examples:
                String                            Arrays
      println, substring, indexOf, replace, sort, toString, equals...
 */

}
