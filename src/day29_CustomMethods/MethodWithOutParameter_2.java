package day29_CustomMethods;
/*
    step1: print hello world 5 times
    step2: print your school name
    step3: print hello world 5 times
    step4: print your name
    step5: print hello world 5 times
 */
public class MethodWithOutParameter_2 {

    public static void printHello5x() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {
        printHello5x();
        System.out.println("Cybertek");
        printHello5x();
        System.out.println("rumeysa");
        printHello5x();

        Method_Practice.printOdd();  // it is the advantage of 'static' specifier
    }


}
