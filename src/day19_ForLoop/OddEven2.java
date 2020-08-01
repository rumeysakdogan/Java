package day19_ForLoop;
/*
    3. print odd numbers between 1 to 50
    4. print even number between 1 to 50
        MUST use continue statement
 */
public class OddEven2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++){

            if( i % 2 == 0){    // if i is even number, skip it
                continue;
            }
            System.out.print(i+" ");
        }

        System.out.println("\n");

        for (int i = 1; i <= 50; i++){

            if( i % 2 != 0){    // if i is odd number, skip it
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
