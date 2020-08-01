package day11_NestedIf_Ternary;

public class Ternary {

    public static void main(String[] args) {

        int num = 100;

        String result = "";

        if(num%2 == 0){
         result = "Even";
         }else{
         result = "Odd";
         }
         System.out.println(result);

        System.out.println("======================");

        String result2 =(num%2 == 0) ? "Even" : "Odd";

        System.out.println(result);

        System.out.println("======================");

        int num1 = 10;
        int num2 = 20;

        int max = (num1>num2) ? num1 : num2 ;

        System.out.println(max);

        System.out.println("======================");

        int age = 36;
        boolean eligible =false;

        if(age>=21){
            eligible = true;
        }else{
            eligible = false;
        }
        System.out.println(eligible);

        boolean eligible3 = (age>=21) ? true : false ;

        System.out.println(eligible3);

        System.out.println("======================");


        String eligible2 = (age>=18) ? "Buy Alcohol!" : "Buy another Drink!";

        System.out.println(eligible2);

        System.out.println("======================");

        boolean citizen = false;

        String canVote = (citizen && age>=21) ? "Can Vote" : "Cannot Vote";

        System.out.println(canVote);


    }
}
