package day62_Maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
Warmup tasks:
    1. create 3 LinkedHashMaps that contains employee name and jobTitle
    2. create a List of Map and store all LinkedHashMaps objects into the list.
    3. Iterate each objects from the list and print out the name of the employee
    if the jobTitle of the employee is SDET
 */
public class ListOfMaps {

    public static void main(String[] args) {

        Map<String,String> scrum1 = new LinkedHashMap<>();
        scrum1.put("Azat","Senior SoftwareDeveloper");
        scrum1.put("Nurahmet","SDET");
        scrum1.put("Arman","QA");
        scrum1.put("Abide","SDET");
        scrum1.put("Jeniffer","BA");


        Map<String,String> scrum2 = new LinkedHashMap<>();
        scrum2.put("Muhtar","Senior SoftwareDeveloper");
        scrum2.put("Fatime M","SDET");
        scrum2.put("Arzu","QA");
        scrum2.put("Bahtiyar","SDET");
        scrum2.put("Romina","BA");


        Map<String,String> scrum3 = new LinkedHashMap<>();
        scrum3.put("Imran","Senior SoftwareDeveloper");
        scrum3.put("Dilfinar","SDET");
        scrum3.put("Atilla","QA");
        scrum3.put("Aidana","SDET");
        scrum3.put("Kamran","BA");

        List< Map<String,String> > teams = Arrays.asList(scrum1, scrum2, scrum3);

        System.out.println( teams);

        for (Map<String,String> eachMap : teams){     // looping through each map in the list

            for(Map.Entry<String,String> each : eachMap.entrySet()){
                String name =  each.getKey();
                String jobTitle = each.getValue();
                if ( jobTitle.equalsIgnoreCase("sdet")){
                    System.out.println( name);
                }
            }

        }


    }
}
