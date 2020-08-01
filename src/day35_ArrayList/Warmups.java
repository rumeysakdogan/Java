package day35_ArrayList;

import java.util.ArrayList;

/*
Warmup tasks:
    1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
    2. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits

    3. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
public class Warmups {
    public static void main(String[] args) {

        String str = "Today's date is 04/27/2020";
        int sum = sumOfDigits("a1b2c3");

        System.out.println(sum);

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        System.out.println( combineToArrayList(arr1,arr2) );
    }

    public static ArrayList<String> combineToArrayList(String[] arr1, String[] arr2){
        ArrayList<String> list = new ArrayList<>();


        for (String each : arr1){
            list.add(each);

        }
        for (String each : arr2){
            list.add(each);
        }
        return list;
    }

    public static int sumOfDigits(String str){
        int sum = 0;

        for (int i = 0; i < str.length(); i++ ){
            if (  str.charAt(i) >= 48  && str.charAt(i)<=57  ){  // Character.isDigit(str.charAt(i))
                int n = Integer.parseInt(""+str.charAt(i));
                sum += n;
            }
        }

        return sum;
    }



}
