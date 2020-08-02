package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll( Arrays.asList(30, 20, 56, 78, 98, 100, 20, 0, -1, -3, 400, 500, 5000) );

        // maximum number:
        Integer max = Collections.max(list);

        // minimum number:
        Integer min = Collections.min(list);

        System.out.println( "Max: " + max);
        System.out.println( "Min: " + min);

        System.out.println("==================================================");

        // replaceAll(CollectionType, oldValue, newValue):

        ArrayList<String> names = new ArrayList<>();
        names.addAll( Arrays.asList("Muhtar", "Saim", "Ramazan", "Muhtar", "Asiya"));

        Collections.replaceAll(names,"Muhtar","Fatime");

        System.out.println( names );    // [Fatime, Saim, Ramazan, Fatime, Asiya]

    }
}
