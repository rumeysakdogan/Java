package day44_Constructor;
/*
warmup task:
    1. Create a class called Employee
            instance variables:
                    name, id, ssn, jobTitle, salary, gender
            static variables:
                   hasSalary; isEmployed;

            actions:

                    setEmployeeInfo(): can initialize all the instance variables
                    toString(): can return the info of the employee as string

 */
public class Employee {

    String name;
    int id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    static boolean hasSalary;
    static boolean isEmployed;

    static{
        hasSalary = true;
        isEmployed = true;
    }

    public Employee(String name, int id, int ssn, String jobTitle, double salary, char gender){
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

/*
    public void setEmployeeInfo(String name, int id, int ssn, String jobTitle, double salary, char gender ){
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }
*/


    public String toString(){
        return "Name: "+name+"\nGender: "+gender+"\nID: "+id+"\nSSN: "+ssn+"\nJobTitle: "+jobTitle+
                "\nSalary: "+salary;
    }
}
