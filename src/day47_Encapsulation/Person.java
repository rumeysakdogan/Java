package day47_Encapsulation;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate DOB;

    public Person(String name, int age, char gender, LocalDate DOB) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
    }

    private long ssn;
    private int id;
    private String address;

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  String toString(){
        return "Name: " + name + ", Age: " + age +
                ", Gender: " + gender + ", DOB: " + DOB;
    }
}
