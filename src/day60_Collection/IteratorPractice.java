package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorPractice {

    public static void main(String[] args) {

        String[] arr = {"Ahmed", "Aalia", "Abzal", "Ahmed", "Virginia", "Ahmed", "Ahmed"};


        ArrayList<String> names = new ArrayList<>( Arrays.asList(arr));
        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            if(it.next().equals("Ahmed")){
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("===================================================");

        ArrayList<String> employee = new ArrayList<>( Arrays.asList(arr));

        for (Iterator<String> i = employee.iterator(); i.hasNext();){
            if(i.next().equals("Ahmed")){
                 i.remove();
            }
        }

        System.out.println(employee);

        System.out.println("===================================================");

        ArrayList<String> students = new ArrayList<>( Arrays.asList(arr));

        students.removeIf( p -> p.equals("Ahmed")); // internally uses iterator
        System.out.println(students);
    }
}
