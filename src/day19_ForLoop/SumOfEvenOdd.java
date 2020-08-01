package day19_ForLoop;
/*
 3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
    4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100

 */
public class SumOfEvenOdd {
    public static void main(String[] args) {

        int sum = 0;

        for ( int i = 2; i <= 100; i+=2 ){
                sum += i;
        }
        System.out.print(sum);

        System.out.println();

        int sum2 = 0;

        for ( int i = 1; i <= 100; i+=2 ){
            sum2 += i;
        }
        System.out.print(sum2);
    }
}
