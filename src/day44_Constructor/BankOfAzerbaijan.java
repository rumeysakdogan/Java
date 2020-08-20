package day44_Constructor;
/*
3. create class called BankOfAzerbaijan
        in the main method:
                1. create a List of Employees
                2. add random two employees from HumanResources to the List
                3. use for each loop to print out the employee info
 */
import java.util.ArrayList;
import java.util.Arrays;
//!!!  import static day44_Constructor.HumanResources.*; // imports all statics from HumanResources

public class BankOfAzerbaijan {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
//            employees.add( HumanResources.employee1 );
//            employees.add( HumanResources.employee3 );
//            employees.add( HumanResources.employee5 );

        // preferred way: calling static members through classname
        employees.addAll( Arrays.asList( HumanResources.employee1, HumanResources.employee2, HumanResources.employee3));


//!!!        employees.addAll( Arrays.asList(employee1,employee3,employee5) );
//!!!   by using static import we are able to import the static members, so we can call them without the classname

        for (Employee each: employees){

            System.out.println(each.name+" : "+each.salary);

        }


    }
}
