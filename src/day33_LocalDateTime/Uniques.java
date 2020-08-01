package day33_LocalDateTime;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/*
Task03:
        1. create a void method that can print out the unique numbers from an array of integer
        2. create a void method that can print out the unique numbers from an array of double
        3. create a void method that can print out the unique words from an array of String
        4. create a void method that can print out the unique characters from an array of chars
        MUST use for each loop
 */
public class Uniques {

    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 3, 3, 4, 6, 7};
        uniqueElements(arr);

        System.out.println("=============================");

        String[] s = {"A", "A", "C", "D", "D", "B"};
        uniqueElements(s);

        System.out.println("=============================");

        char ch[] = {'c', 'k', 'k', 'u', 'o', 'o'};
        uniqueElements(ch);
    }

    public static void uniqueElements(int[] arr){

        for (int each : arr){
            int count = 0;
            for (int i : arr){
                if (each == i){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(each+" ");
            }
        }
        System.out.println();
    }
    public static void uniqueElements(double[] arr){

        for (double each : arr){
            int count = 0;
            for (double i : arr){
                if (each == i){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(each+" ");
            }
        }
        System.out.println();
    }
    public static void uniqueElements(String[] arr){

        for (String each : arr){
            int count = 0;
            for (String i : arr){
                if (each.equals(i)){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(each+" ");
            }
        }
        System.out.println();
    }
    public static void uniqueElements(char[] arr){

        for (char each : arr){
            int count = 0;
            for (char i : arr){
                if (each == i){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(each+" ");
            }
        }
        System.out.println();
    }




}
