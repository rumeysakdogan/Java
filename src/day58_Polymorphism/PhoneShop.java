package day58_Polymorphism;

import day57_Polymorphism.phoneTask.*;

import java.util.ArrayList;
import java.util.Arrays;

/*
      (Phone is imported from day57 package)
        create an arrayList called phoneShop and
        store all phone objects from array of phone
        write a program that can count the total number of Iphone,
         Samsung and Huawei from the list

 */
public class PhoneShop {
    public static void main(String[] args) {

        Phone[] phone = {
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100)
        };

        ArrayList<Phone> phoneShop = new ArrayList<>(Arrays.asList( phone ));

        int countIphone = 0;
        int countSamsung = 0;
        int countHuawei = 0;

        /*
        for (int i = 0; i < phoneShop.size(); i++) {
            Phone each = phoneShop.get(i);

            if ( each instanceof Iphone){
                countIphone++;
            }else if( each instanceof Samsung){
                countSamsung++;
            }else{
                countHuawei++;
            }
        }
         */

       for (Phone eachPhone : phoneShop){
           if ( eachPhone instanceof Iphone){
               countIphone++;
           }else if( eachPhone instanceof Samsung){
               countSamsung++;
           }else{
               countHuawei++;
           }
       }

        System.out.println("countIphone = " + countIphone);
        System.out.println("countSamsung = " + countSamsung);
        System.out.println("countHuawei = " + countHuawei);

    }
}
