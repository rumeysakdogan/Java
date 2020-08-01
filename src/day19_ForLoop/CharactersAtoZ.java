package day19_ForLoop;
/*
5. Write a program that will print out all letters in English alphabet in ascending order
6. Write a program that will print out all letters in English alphabet in descending order

 */
import java.util.Scanner;
public class CharactersAtoZ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for ( char c = 'A'; c <= 'Z'; c++ ){
            System.out.print(c+" ");
        }

        System.out.println();

        for ( char c = 'Z'; c >= 'A'; c-- ){
            System.out.print(c+" ");
        }

        System.out.println();

        for ( int i = 97; i <= 122; i++ ){
            System.out.print( (char)i +" ");
        }

        System.out.println();

        for ( int i = 122; i >= 97; i-- ){
            System.out.print( (char)i +" ");
        }

        System.out.println();

    }
}
