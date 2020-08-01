package day13_Scanner;
/*
write a program that can calculate the state tax, federal tax and salary after tax
                needed information:
                                annual salary
                                state tax rate
                                federal tax rate
                MUST use Scanner

 */
import java.util.Scanner;

public class SalaryAfterTax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your annual salary: ");

        int salary = scan.nextInt();

        System.out.println("Please enter your state tax rate: ");
        double stateTaxRate = scan.nextDouble();
        double stateTax = salary * stateTaxRate;

        System.out.println("Please enter your federal tax rate: ");
        double federalTaxRate = scan.nextDouble();
        double federalTax = salary * federalTaxRate;

        double salaryAfterTax = salary - (stateTax+federalTax);

        System.out.println("Your salary: $"+salary);
        System.out.println("Your state tax: $"+stateTax);
        System.out.println("Your state tax: $"+federalTax);
        System.out.println("Your annual salary after tax: $"+salaryAfterTax);

    }
}
