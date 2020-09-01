package day49_Inheritance.scrumTeamTask;
/*
  create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo

 */
public class Person {

    public String name;
    public int age;
    public char gender;

    private long ssn;  // we don't want this data to be inherited to the sub classes

    public void setSsn(long ssn){   // modify ssn only
        this.ssn = ssn;
    }

    public long getSsn(){   // read ssn only
        return ssn;
    }

    public void setInfo(String name, int age, char gender){  // only sets name, age, gender
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // we don't want these actions to be inherited to the Employee class
    // That's why we gave them private access-modifier
    private void eat(){
        System.out.println(name + " is eating");
    }

    private void walk(){
        System.out.println(name + " is walking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}
