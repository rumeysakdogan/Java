package day29_CustomMethods;
/*
task:
    1. create a method that can print odd numbers between 1~100
    2. create a method that can print even numbers between 1~100

 */
public class Method_Practice {

    public static void main(String[] args) {

        printEven();
        System.out.println("Hello");

        printOdd();
        System.out.println("Hello");

    }

    public static void printOdd(){

        for (int i = 1; i <= 100; i += 2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printEven(){

        for (int i = 2; i <= 100; i += 2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
