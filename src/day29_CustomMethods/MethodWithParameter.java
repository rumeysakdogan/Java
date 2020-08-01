package day29_CustomMethods;

import java.util.Scanner;

public class MethodWithParameter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        printHelloNx( scan.nextInt() );

    }

    public static void printHelloNx(int numberOfTimes){

        for (int i = 0; i < numberOfTimes; i++){
            System.out.println("Hello World!");
        }

    }
}
