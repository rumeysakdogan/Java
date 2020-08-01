package day08_LogicalOperations;
/*
    task:
1. Create a double variable with the value 20
2. Create a second variable of type double with the value 80
3. Add both numbers up and multiply by 25
4. Use the remainder operator to figure out the remainder from the sum of #3 divided
by 40
5. Print remaining total (#4) is equal to 20 or less : true/false
 */
public class Practice4 {
    public static void main(String[] args) {
        double d1 = 20;
        double d2 = 80;

        double d3 = (d1+d2) * 25;
        double d4 = d3 % 40;
        boolean result = d4 <= 20;

        System.out.println(result);
    }
}
