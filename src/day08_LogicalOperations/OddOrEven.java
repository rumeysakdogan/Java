package day08_LogicalOperations;

public class OddOrEven {

    public static void main(String[] args) {

        int num = 30;

        if (num % 2 == 0){
            System.out.println(num+" is an even number.");
        }
        if (num % 2 != 0){
            System.out.println(num+" is an odd number.");
        }

        System.out.println("==================");
       // Muhtar's approach:

        boolean even = num % 2 == 0;
        boolean odd = !even;

        if(even){
            System.out.println(num+" is an even number.");
        }
        if(odd){
            System.out.println(num+" is an odd number.");
        }
    }
}
