package day47_Encapsulation;

/*
2. create a class called CapitalOneEmployees
                instance variables:
                        employeeName
                        employeeAge
                        jobTitle
                    private ID
                    private salary
                    private address
                    company name = "Capital One"
                    generate getters & setters for private variables

 */
public class CapitalOneEmployees {

    String employeeName;
    int employeeAge;
    String jobTitle;

    private int ID;
    private double salary;
    private String address;

    public static String companyName;

    static{
        companyName = "Capital One";
    }

    public CapitalOneEmployees(String employeeName, int employeeAge, String jobTitle){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.jobTitle = jobTitle;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public int getID(){
        return ID;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public String toString(){
        return "Name: "+employeeName+", Age: "+employeeAge+", JobTitle: "+jobTitle+
        ", Salary: "+getSalary()+", ID: "+getID();
    }
}
