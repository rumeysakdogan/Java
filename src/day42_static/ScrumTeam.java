package day42_static;

import java.util.ArrayList;
import java.util.Arrays;

/*
    create a class called ScrumTeam
                    Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testers = new ArrayList<>();
                            ArrayList<Developer> developers = new ArrayList<>();
                    Actions:
                            setInfo(): sets the names of: PO, BA, SM
                            addTester(Tester tester): adds the given tester to the testers arraylist
                            addTesters(Tester[] testers): adds the given testers to the testers arraylist
                            addDeveloper(Developer developer): adds the given developer to the developers arraylist
                            addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                            removeTester(long employeeID): removes the given tester from the testers arraylist
                            removeDeveloper(long employeeID): removes the developer from the developers arraylist
                            toString(): print # of testers&developers, PO name, BA name, SM name
 */
public class ScrumTeam {

    String PO;
    String BA;
    String SM;
    ArrayList<Testers> testers = new ArrayList<>();
    ArrayList<Developers> developers = new ArrayList<>();

    public void setInfo(String PO, String BA, String SM){
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester( Testers tester){
        testers.add(tester);
    }

    public void addTesters(Testers[] testers){
        this.testers.addAll(  Arrays.asList(testers) );
    }

    public void  removeTester(long employeeID){
        testers.removeIf( p -> p.employeeID == employeeID);
    }

    public void addDeveloper( Developers developer){
        developers.add(developer);
    }
// since arraylist and local variable has SAME name, we need to use this. keyword to call instance variable arraylist.
    public void addDevelopers(Developers[] developers){
        this.developers.addAll(  Arrays.asList(developers) );
    }

    public void removeDeveloper(long employeeID){
        developers.removeIf( p -> p.employeeID == employeeID);
    }

    public String toString(){
        return "Product Owner: " + PO + ", Scrum Master: "+ SM + ", Business Analyst: "+ BA + ", # of Testers: "+ testers.size()
                + ", # of Developers: " + developers.size();
    }
}
