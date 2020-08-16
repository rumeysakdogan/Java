package day42_static;
/*
 create a class called Developer
                    Attributes:
                        name, employeeID, JobTitle, Salary
                    Actions:
                        setInfo(), coding(),  fixBug(), toString()
 */
public class Developers {

    String name;
    long employeeID;
    String jobTitle;
    double salary;
    char gender;

    public void setInfo(String name, char gender, long employeeID, String jobTitle, double salary){
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.gender = gender;
    }
    public void coding(){
        System.out.println(name + " is coding");
    }

    public void fixBugs(){
        System.out.println(name + "is fixing bugs");
    }


    public String toString() {
        return "Name: " + name + ", Gender : " + gender + ", EmployeeID: " + employeeID + ", Job Title: " + jobTitle + ", Salary: " + salary;
    }


}