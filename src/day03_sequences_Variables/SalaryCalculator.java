package day03_sequences_Variables;
/*
task:
        variables: salary, tax

                totalTax = salary * tax;
                salaryAfterTax = salary - totalTax

                100000,  0.28;
                100000 * 0.28 = 28000;
                100000 - 28000 = 72000;
 */
public class SalaryCalculator
{
    public static void main(String[] args)
    {
     double salary = 100000;
     double tax = 0.28  ;
     double totalTax = salary * tax;
     double salaryAfterTax = salary - totalTax;

        System.out.println(salaryAfterTax);

    }



}
