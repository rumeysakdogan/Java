package day61_Maps;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IteratingKeysValues {

    public static void main(String[] args) {

        Map<String, LocalDate> students = new TreeMap<>();
            students.put("Elizaveta", LocalDate.of(1987,4,12));
            students.put("Hasan", LocalDate.of(1985,6,5));
            students.put("Judy", LocalDate.of(1991,11,19));
            students.put("Muhtar", LocalDate.of(1989,3,23));

        System.out.println( students );

        // Set<String> keys = students.keySet();
        // System.out.println( keys );

        // looping through all the keys
        for( String each : students.keySet()){
            System.out.println( each );
        }

        System.out.println("================================");

        for( LocalDate each : students.values()){
            System.out.println( each );
        }

    }
}
