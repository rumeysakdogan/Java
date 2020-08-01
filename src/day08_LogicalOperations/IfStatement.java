package day08_LogicalOperations;

public class IfStatement
{

    public static void main(String[] args)
    {

        int a = 20;
        int b = 20;

        if (a > b) {
            System.out.println(a + " is the maximum number.");
        }
        if (b > a) {
            System.out.println(b + " is the maximum number.");
        }
        if (a == b) {
            System.out.println("They are equal.");
        }

        System.out.println("=========================");

        boolean breakTime = true;

        if (breakTime == true){
            System.out.println("Take 15 minutes break!");
        }

        if (breakTime == false){
            System.out.println("Keep Studying!");
        }

        System.out.println("=========================");

        boolean Corona = false;

        if (Corona == true){
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more hand sanitizers");
            System.out.println("Keep social distance");
            System.out.println("Wear masks");
            System.out.println("Stay at home");
        }


    }
}
