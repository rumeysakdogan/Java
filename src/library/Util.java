package library;

import java.util.Arrays;

public class Util {

    public static String removeDuplicates(String str){

        String result = "";

        for (String each : str.split("")){

            if (!result.contains(each)) {
                result += each;
            }
        }
        return result;
    }

    public static String reverseString(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }

        return result;
    }

    public static int frequency(String str, char ch){
        int count = 0;

        for ( char each: str.toCharArray() ){
            if (each == ch){
                count++;
            }
        }
        return count;
    }

    public static String uniques(String str){

        String uniques ="";

        for ( char each : str.toCharArray() ){
            if ( frequency(str,each)==1 ){
                uniques += each;
            }
        }
        return uniques;
    }

    public static String frequencyOfChars( String str ){

        String result = "";

        String nonDup = Util.removeDuplicates(str);

        for ( char each : nonDup.toCharArray()){
            result += ""+ each + Util.frequency(str, each);
        }
        return result;
    }

    public static String formatFullName(String first, String last){

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();

        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first + " " + last;

        return fullName;
    }



    public static int max(int[] arr){

        int max = arr[0];


        for (int each : arr){
            if ( each > max){
                max = each;
            }
        }
        return max;
    }

    public static double max(double[] arr){

        double max = arr[0];


        for (double each : arr){
            if ( each > max){
                max = each;
            }
        }
        return max;
    }

    public static Integer max(Integer[] arr){

        int max = arr[0];


        for (Integer each : arr){
            if ( each > max){
                max = each;
            }
        }
        return max;
    }

    public static Double max(Double[] arr){

        Double max = arr[0];


        for (Double each : arr){
            if ( each > max){
                max = each;
            }
        }
        return max;
    }

    public static int min(int[] arr){

        int min = arr[0];

        for (int each : arr){
            if (min > each){
                min = each;
            }
        }
        return min;
    }

    public static double min(double[] arr){

        double min = arr[0];

        for (double each : arr){
            if (min > each){
                min = each;
            }
        }
        return min;
    }

    public static Integer min(Integer[] arr){

        int min = arr[0];

        for (int each : arr){
            if (min > each){
                min = each;
            }
        }
        return min;
    }

    public static Double min(Double[] arr){

        Double min = arr[0];

        for (Double each : arr){
            if (min > each){
                min = each;
            }
        }
        return min;
    }

    public static int[] addElement(int[] arr, int n){
        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1] = n;

        int k=0;
        for (int each : arr){
            arr2[k] = each;
            k++;
        }
        return arr2;
    }
// overload for double,Double,Integer,char,Character,String
    public static int[] sortDescending(int[] arr){

        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];

        int k = arr.length-1;
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static double[] sortDescending(double[] arr){

        Arrays.sort(arr);
        double[] arr2 = new double[arr.length];

        int k = arr.length-1;
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static String[] sortDescending(String[] arr){

        Arrays.sort(arr);
        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static char[] sortDescending(char[] arr){

        Arrays.sort(arr);
        char[] arr2 = new char[arr.length];

        int k = arr.length-1;
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static Integer[] sortDescending(Integer[] arr){

        Arrays.sort(arr);
        Integer[] arr2 = new Integer[arr.length];

        int k = arr.length-1;
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static Double[] sortDescending(Double[] arr){

        Arrays.sort(arr);
        Double[] arr2 = new Double[arr.length];

        int k = arr.length-1;
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static Character[] sortDescending(Character[] arr){

        Arrays.sort(arr);
        Character[] arr2 = new Character[arr.length];

        int k = arr.length-1;
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static int[] combine2Arrays(int[] arr1, int[] arr2){

        int arr3[] = new int[arr1.length + arr2.length];

        int k = 0;
        for (int each : arr1){
            arr3[k] = each;
            k++;
        }

        for (int each : arr2){
            arr3[k] = each;
            k++;
        }

        return arr3;
    }

    public static String[] combine2Arrays(String[] arr1, String[] arr2){

        String arr3[] = new String[arr1.length + arr2.length];

        int k = 0;
        for (String each : arr1){
            arr3[k] = each;
            k++;
        }

        for (String each : arr2){
            arr3[k] = each;
            k++;
        }

        return arr3;
    }

    public static char[] combine2Arrays(char[] arr1, char[] arr2){

        char arr3[] = new char[arr1.length + arr2.length];

        int k = 0;
        for (char each : arr1){
            arr3[k] = each;
            k++;
        }

        for (char each : arr2){
            arr3[k] = each;
            k++;
        }

        return arr3;
    }

    public static double[] combine2Arrays(double[] arr1, double[] arr2){

        double arr3[] = new double[arr1.length + arr2.length];

        int k = 0;
        for (double each : arr1){
            arr3[k] = each;
            k++;
        }

        for (double each : arr2){
            arr3[k] = each;
            k++;
        }

        return arr3;
    }

    public static Integer[] combine2Arrays(Integer[] arr1,Integer[] arr2){

        Integer arr3[] = new Integer[arr1.length + arr2.length];

        int k = 0;
        for (Integer each : arr1){
            arr3[k] = each;
            k++;
        }

        for (Integer each : arr2){
            arr3[k] = each;
            k++;
        }

        return arr3;
    }

    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2){

        Double arr3[] = new Double[arr1.length + arr2.length];

        int k = 0;
        for (Double each : arr1){
            arr3[k] = each;
            k++;
        }

        for (Double each : arr2){
            arr3[k] = each;
            k++;
        }

        return arr3;
    }

    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2){

        Character arr3[] = new Character[arr1.length + arr2.length];

        int k = 0;
        for (Character each : arr1){
            arr3[k] = each;
            k++;
        }

        for (Character each : arr2){
            arr3[k] = each;
            k++;
        }

        return arr3;
    }


}
