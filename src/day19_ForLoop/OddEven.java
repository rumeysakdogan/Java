package day19_ForLoop;
import java.util.Scanner;
/*
 1. write a program that can print all even numbers between 0 ~ 100 that can be divisible by 3&5
 2. write a program that can print all odd numbers between 0 ~ 100 that can be divisible by 3&5

 */
public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 100; i += 2){

            if( i % 3 == 0  && i % 5 == 0 ) {
                System.out.print(i + " ");
            }
        }

        // another approach:

//        for (int i = 0; i <= 100; i ++){
//            if( i % 2 != 0){        // pre: i MUST be odd number
//                if ( i % 3 == 0  && i % 5 == 0 ){   // sub: MUST be divisible by 3 & 5
//                    System.out.print(i + " ");
//                }
//            }
//        }

        System.out.println(); // to give a new line

        for (int i = 0; i <= 100; i += 2){

            if( i % 15 == 0 ) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        int value = scan.nextInt();
        int count = 0;
        while(value > 0){
            count++;
            value = scan.nextInt();
        }
        System.out.println(count);

    }
}
