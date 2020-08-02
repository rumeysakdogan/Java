package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
            students.add("Sayeem");
            students.add("Waqar");
            students.add("Beslan");
            students.add("Dawud");
            students.add("Ramazan");
            students.add("Mehary");

        boolean b1 = students.containsAll(Arrays.asList("Ulku", "Busra"));

        System.out.println(b1); // false

        System.out.println("===================================================");

        ArrayList<String> group1 = new ArrayList<>();

        // add all student names in your group
            group1.addAll(  Arrays.asList("Bulent", "Cihat", "Ibrahim", "Sherzat", "Altynai", "Agit", "Hafize","Roman", "Vlad", "Burak", "Dusan"));

        System.out.println( group1 );

            boolean b2 = group1.containsAll( Arrays.asList("Anna", "Busra"));

        System.out.println( b2 );

        System.out.println("===================================================");

        // task: remove all employees from the list whose name is Ahmed

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(  Arrays.asList("Bulent", "Ahmed", "Ibrahim", "Sherzat", "Ahmed", "Ahmed", "Burak", "Dusan"));

        System.out.println(employees);    //   [Bulent, Ahmed, Ibrahim, Sherzat, Ahmed, Ahmed, Burak, Dusan]

        employees.removeAll(Arrays.asList("Ahmed"));

        System.out.println(employees);   //    [Bulent, Ibrahim, Sherzat, Burak, Dusan]

    }
}
