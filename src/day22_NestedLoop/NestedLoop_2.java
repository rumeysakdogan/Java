package day22_NestedLoop;

public class NestedLoop_2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++ ){
            System.out.print(i+" ");
        }

        System.out.println();

        for ( int i = 0; i < 5; i++){   // responsible for inner loop 5 times with appending new line each time
            for (int j = 0; j < 5; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
