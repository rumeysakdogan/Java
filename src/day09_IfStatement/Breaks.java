package day09_IfStatement;

public class Breaks {

    public static void main(String[] args) {

        String itsBreakTime = "no";
        // boolean breakTime = true;
         // (breakTime)
        if(itsBreakTime == "yes"){
            System.out.println("Enjoy your break");
        }else{
            System.out.println("Listen Muhtar, practice Java");
        }

        System.out.println("====================");

        int a = 100;
        int b = 200;

        if(a > b){
            System.out.println(a+" is greater");
        }else{
            System.out.println(b+" is greater");
        }

        
//        boolean aIsMax = a > b;
//        int max = 0;
//
//        if(aIsMax){
//            max = a;
//        }else{
//            max = b;
//        }
//        System.out.println(max);

    }
}
