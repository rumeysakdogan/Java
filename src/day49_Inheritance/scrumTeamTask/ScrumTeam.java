package day49_Inheritance.scrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called ScrumTeam
                    Attributes:
                            ArrayList<Tester> testers = new ArrayList<>(),
                            ArrayList<Developer> testers = new ArrayList<>(),
                    Actions:
                            addTester(Tester tester): adds the given tester to the testers arraylist
                            addTesters(Tester[] testers): adds the given testers to the testers arraylist
                            addDeveloper(Developer developer): adds the given developer to the developers arraylist
                            addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                            removeTester(long employeeID): removes the given tester from the testers arraylist
                            removeDeveloper(long employeeID): removes the developer from the developers arraylist

 */
public class ScrumTeam {

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(Tester[] testers, Developer[] developers){
        addTesters(testers);    // adds the array of testers to the list
        addDevelopers(developers);  // adds the array of developers to the list
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll( Arrays.asList(testers) );
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll( Arrays.asList(developers) );
    }

    public void removeTester(long id){
        testers.removeIf( p -> p.id == id);
    }

    public void removeDeveloper(long id){
        developers.removeIf( p -> p.id == id);
    }

    public void removeTesterdDeveloper(int testerId, int developerId){
        removeTester(testerId);
        removeDeveloper(developerId);
    }

    public String toString(){
        return "================================"+
                "\nDevelopers #: "+developers.size()+
                "\nTesters #: "+testers.size()+
                "\nCapacity: "+((developers.size()+testers.size())*8)+ " point (Dev.Team * 8 Days)"+
                "\nVelocity: "+((developers.size()+testers.size())*8)+ " point for current Sprint (No days Off)"+
                "\n================================";
    }
}
