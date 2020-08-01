package day04_Variables;
/*
 declare the following variables:
        String employeeName
        int employeeID
        String jobTitle
        double salary
        char gender
        boolean isFullTime = true;

 */
public class Variables3 {

    public static void main(String[] args) {
        // school name: CyberTek School

        String schoolName = "Cybertek School";

        String employeeName = "Rumeysa"; // "Employee name is: " + employeeName
        int employeeID = 12345;
        String jobTitle = "SDET";
        double salary = 120_000.50;
        char gender = 'F';
        boolean isFullTime = true;

        System.out.println("Employee name: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Job title: " + jobTitle);
        System.out.println("Salary: " + salary + " USD");
        System.out.println("Gender: " + gender);
        System.out.println("FullTime: " + isFullTime);

    }
}
