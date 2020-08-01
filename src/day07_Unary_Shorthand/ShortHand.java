package day07_Unary_Shorthand;

public class ShortHand {

    public static void main(String[] args) {

        int a = 100;
         // a = a * a;
         a *= a;
         System.out.println(a);

        int b = 2;
        b *= 3;
        System.out.println(b);

        int c = 300;
        c -= 100;
        System.out.println(c);

        System.out.println("======================");

        // += you can apply to numbers and strings

        int z = 300;
        z += 200;   // z = z + 200
        System.out.println(z);

        String schoolName = "Cybertek";
            // schoolName = schoolName + " School"
        schoolName += " School";
        System.out.println(schoolName);

        String fullName = "Rumeysa";  // += : only addition assignment can be applied to the strings
        fullName += " Dogan";
        System.out.println(fullName);

        // /=:
        int budget = 100000;
            budget /= 4;
        System.out.println(budget);

        // %= :
        int num = 100;
            num %= 3;
        System.out.println(num);

        double num2 = 400.5;
                num2 %= 2;
        System.out.println(num2);


    }
}
