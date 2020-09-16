package day54_Abstraction.employeeTask;

import java.time.LocalDate;

/*
 1.create a class named Employee (meant to be super class):
            Attributes:
                    name, gender(final), DOfB(final), jobTitle, Salary
                    create constructor that can initialize all those attributes
                        (even final variable you should initialize them within constructor)

 */
public class Employee {

    public String name;
    final public char gender;       // constant
    final public LocalDate DOfB;    // constant
    public String jobTitle;
    public double salary;

    public Employee(String name, char gender, LocalDate DOfB, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOfB = DOfB;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString(){
        return "Name: " + name +", Gender: " + gender + ", DofB: "+ DOfB + ", JobTitle: " +
                jobTitle +", Salary: $"+salary;
    }
}
