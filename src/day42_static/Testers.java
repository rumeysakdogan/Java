package day42_static;
/*
        create a class called Testers
                    Attributes:
                        name, employeeID, JobTitle, Salary
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()

 */
public class Testers {

    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;


    public void setInfo(String name, char gender, long employeeID, String jobTitle, double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public void smokeTesting(){
        System.out.println(name+ " is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name + " is creating a bug ticket");
    }

    public String toString(){
        return "Name: "+name + ", Gender: " + gender +", EmployeeID: " + employeeID +", Job Title: " + jobTitle + ", Salary: " + salary;
    }
}
