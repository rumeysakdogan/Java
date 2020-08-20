package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Roman",'M',198765432l,"QA",120000.0);
        Employee employee2 = new Employee("Meeriem",'F',768954320L,"QA",120000.50);
        Employee employee3 = new Employee("Ramazan", 'M', 342151342l, "SDET", 150000.0);
        Employee employee4 = new Employee("Musa", 'M', 123456789l, "SDET", 135000.0);
        Employee employee5 = new Employee("Tetiana", 'F', 987654321L, "SDET", 125000.0);
        Employee employee6 = new Employee("John",'M', 345678290L,"BA",150000.70);

/*
        employee1.setEmployeeInfo("Roman",'M',198765432l,"QA",120000.0);
        employee2.setEmployeeInfo("Meeriem",'F',768954320L,"QA",120000.50);
        employee3.setEmployeeInfo("Ramazan", 'M', 342151342l, "SDET", 150000.0);
        employee4.setEmployeeInfo("Musa", 'M', 123456789l, "SDET", 135000.0);
        employee5.setEmployeeInfo("Tetiana", 'F', 987654321L, "SDET", 125000.0);
        employee6.setEmployeeInfo("John",'M', 345678290L,"BA",150000.70);
*/


        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6));

        double max = Integer.MIN_VALUE;
        String name = "";

        for( Employee each : employeeList){
            double eachSalary = each.salary;
            if ( max < eachSalary){
                max = eachSalary;
                name = each.name;
            }
        }

        System.out.println("Max salary: " + max);
        System.out.println("Name: " + name);

        System.out.println("================================================");

      // employeeList.removeIf(p -> p.salary < 150000);

       // employeeList.removeIf(p -> p.jobTitle.equals("QA") );

        //employeeList.removeIf(p -> p.name.toLowerCase().contains("m"));

        employeeList.removeIf(p -> p.name.startsWith("R"));

        for( Employee each : employeeList){
            // each.getEmployeeInfo();
            System.out.println( each.name+ " : "+ each.salary);
        }
    }
}
