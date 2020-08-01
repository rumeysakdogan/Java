package day22_NestedLoop;

public class NestedLoop_4 {
    public static void main(String[] args) {

        for(int i = 0; i < 7; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("======================");

        for(int i = 0; i < 7; i++){
            for(int j = 7; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("======================");

        // second approach:

//        for(int i = 7; i >= 1; i--){
//            for(int j = i; j >= 1; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println("======================");
//
//        for(int i = 1; i <= 7; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        
    }
}
