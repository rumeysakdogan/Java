package day54_Abstraction.employeeTask;

import java.time.LocalDate;

/*
 2. create a sub class of Employee named Tester(meant to be subClass ONLY)

 */
public final class Tester extends Employee{

    public Tester(String name, char gender, LocalDate DOfB, String jobTitle, double salary) {
        super(name, gender, DOfB, jobTitle, salary);
    }

    public void findBug(){
        System.out.println(name + " found a bug");
    }


}
