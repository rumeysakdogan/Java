package day49_Inheritance.scrumTeamTask;
/*
        create a subclass of Person called Employee
                attributes: name, age, gender, Salary, ID, jobTitle
                methods: work, setEmployeeInfo
 */
public class Employee extends Person {

    /*
    name, age, gender
    getSsn(), setSsn(), sleep(), setInfo(name, age, gender)
     */

    public double salary;
    public int id;
    public String jobTitle;

    // we applied method overloading sets name, age, gender, id, salary, jobtitle
    public void setInfo(String name, int age, char gender, double salary, int id, String jobTitle){
        setInfo(name, age, gender);
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString(){
        return "Name: " + name  + ", Age: " + age + ", Gender: " +
                gender + ", JobTitle: " + jobTitle +
                ", Salary: $" + salary + ", ID: " + id;
    }
}
