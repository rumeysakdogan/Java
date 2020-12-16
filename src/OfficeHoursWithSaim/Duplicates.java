package OfficeHoursWithSaim;

import java.util.*;

/*
 * Create a method will take an Integer ArrayList and remove any duplicates values. Return an ArrayList of unique elements.
 *  -> 1, 2,3 ,2, 2, 1,4, 5
 *  -> 1, 2,3, 4
 */
public class Duplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2,3 ,2, 2, 1,4, 5));
        System.out.println( removeDup(list));
    }
    public static ArrayList<Integer> removeDup(ArrayList<Integer> nums){

        ArrayList<Integer> uniqueValues = new ArrayList<>();

        for(Integer each : nums){

            if (!uniqueValues.contains(each)){
                uniqueValues.add(each);
            }
        }

        return uniqueValues;
    }

    // shorter way, but not good in interview
    public static ArrayList<Integer> removeDup2(ArrayList<Integer> list){
        return new ArrayList<Integer>( new LinkedHashSet<>(list) );
    }

}
