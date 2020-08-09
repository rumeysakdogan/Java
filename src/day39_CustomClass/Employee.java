package day39_CustomClass;

public class Employee {

    String name;
    char gender;
    Long SSN;
    String jobTitle;
    Double salary;


    public void setEmployeeInfo(String employeeName, char employeeGender, Long employeeSSN, String employeeJobTitle, Double employeeSalary){
       name = employeeName;
       gender = employeeGender;
       SSN = employeeSSN;
       jobTitle = employeeJobTitle;
       salary = employeeSalary;
    }

    public void getEmployeeInfo(){
        System.out.println("Name: "+name+", Gender: "+gender+", JobTitle: "+jobTitle+", Salary: "+salary);

        System.out.println("Last 4 digits of SSN: "+(""+SSN).substring( (""+SSN).length()-4 ));
    }

    public void attendMeeting(){}



    }
