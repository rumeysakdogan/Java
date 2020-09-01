package day49_Inheritance.scrumTeamTask;
/*
create a subclass of Employee called Testers
                    Attributes:
                        name, age, gender, Salary, ID, jobTitle
                    Actions:
                        work(), setInfo(), toString(), smokeTesting(),  creatingTicket()
                         these 3 are already inherited
 */
public class Tester extends Employee{

    public Tester(String name, int age, char gender, double salary, int id, String jobTitle){
        setInfo(name, age, gender, salary, id, jobTitle);
    }

    public void smokeTesting(){
        System.out.println(name + " is running smoke test, while drinking coffee!");
    }

    public void creatingTicket(){
        System.out.println(name + " is creating ticket on Jira-Xray");
    }
}
