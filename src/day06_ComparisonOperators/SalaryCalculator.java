package day06_ComparisonOperators;
/*
task04:
			Create a class called SalaryCalculator,
			write a program that can calculate the tax,
			 and salary after tax based on the hourly rate & tax rates

				ex:
					if: rate = 55;
						stateTaxRate = 0.04;
						federalTaxRate =0.22;
						weeklyHours = 40;

					then output will be:
							your salary is: 105600 USD
							your total tax is: 27456 USD
							your income after tax is: 78144 USD

				Assume that a year has 48 weeks (excluding PTO)


 */
public class SalaryCalculator {

    public static void main(String[] args) {

        int rate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        int weeklyHours = 40;

        int salary = weeklyHours * rate * 48;
        double totalTax =   salary * ( stateTaxRate + federalTaxRate );
        double incomeAfterTax = salary -totalTax;

        System.out.println("Your salary is: "+salary+" USD");
        System.out.println("Your total tax is: "+totalTax+" USD");
        System.out.println("Your income after tax is: "+incomeAfterTax+" USD");
    }
}

