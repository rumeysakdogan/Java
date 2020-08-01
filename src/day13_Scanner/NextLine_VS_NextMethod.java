package day13_Scanner;

import java.util.Scanner;

public class NextLine_VS_NextMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // 120000enter

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble(); // 120000 (it only accepts numbers)

        // to solve this problem we write this
        scan.nextLine(); // enter will be assigned here (only nextLine take enter key)

        System.out.println("Enter your fullname: "); // disadvantage only occurs using
                                                // nextLine after other methods of scanner
        String fullName = scan.nextLine(); // enter will automatically assigned

        System.out.println("Salary: "+salary);
        System.out.println("Fullname: "+fullName);
    }
}
