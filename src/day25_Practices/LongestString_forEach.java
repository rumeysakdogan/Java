package day25_Practices;

//Write a program that can return the longest string of text from a String array

public class LongestString_forEach {
    public static void main(String[] args) {

        String[] names = {"Anam", "Nickolas", "Amir", "Zeynep", "Nurmamet"};

        int maxLength = names[0].length();


        for (String each : names){                                // to find the maxLength
            if (maxLength < each.length()){
                maxLength = each.length();
            }
        }

        for (String each : names){                               // to find the strings who has minlength
            if (each.length() == maxLength){
                System.out.println(each);
            }
        }


    }
}
