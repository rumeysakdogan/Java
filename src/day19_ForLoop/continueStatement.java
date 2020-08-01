package day19_ForLoop;
import  java.util.Scanner;
public class continueStatement {
    public static void main(String[] args) {

        for ( int i = 1; i <= 5; i++){  // i: 1, 2, 3, 4, 5

            if( i == 3){
                continue;   // to skip current iteration or to jump to next iteration
            }
            System.out.print(i+" ");
        }

        System.out.println("\n========================");

        for ( char ch = 'A'; ch <= 'F'; ch++){

            if(ch == 'C'){
                continue;
            }
            System.out.print(ch+" ");
        }

        System.out.println();


    }
}
