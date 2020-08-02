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





    }
}
