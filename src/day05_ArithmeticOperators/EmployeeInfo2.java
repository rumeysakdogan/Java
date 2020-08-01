package day05_ArithmeticOperators;
/*
Task:
		1. create a class named EmployeeInfo
					declare the following variables:
							 firstName
							 lastName
							 gender
							 age
							 companyName
							 jobTitle
							 isFullTime
							 isMarried
							 salary

			write a program that can display the full info of the employee
					ex:
					    	 firstName = John
							 lastName = Daniel
							 gender = Male
							 age = 35
							 companyName = CapitalOne
							 jobTitle = SDET
							 isFullTime = true
							 isMarried = false
							 salary = 120000.50

			 output:
			 			Employee' full name is: John Daniel
			 			John Daniel' gender is: Male
			 			John Daniel' age is: 35 years old
			 			John Daniel works at: CapitalOne
			 			John Daniel' Job title is: SDET
			 			John Daniel' salary is 120000.5 $
			 			John Daniel is full time employee: true
			 			John Daniel is married: false
 */
public class EmployeeInfo2 {

    public static void main(String[] args) {
        String firstName = "Aaron";
        String lastName = "Jones";
        String fullName = firstName + " " + lastName;
        String gender = "Male";
        int age = 45;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 110_000.50;


        System.out.println("Employee' full name is: " + fullName);
        System.out.println(fullName + "'s gender is: " + gender);
        System.out.println(fullName + "'s age is: " + age + " years old");
        System.out.println(fullName+ " works at: " + companyName);
        System.out.println(fullName+ "'s Job title is: " + jobTitle);
        System.out.println(fullName+ "'s salary is: " + salary + " $");
        System.out.println(fullName+ " is full time employee: " + isFullTime);
        System.out.println(fullName+ " is married: " + isMarried);
    }
}