package day25_Practices;

//Write a program that can return the shortest string of text from a String array

public class ShortestString_forEach {
    public static void main(String[] args) {

        String[] names = {"Anam", "Nickolas", "Amir", "Zeynep", "Nurmamet"};

        int minLength = names[0].length();


        for (String each : names){// to find the minLength
            int l = each.length();
            if (minLength > l){
                minLength = l;
            }
        }

        System.out.println(minLength);

        for (String each : names){       // to find the strings who has minlength
            int l = each.length();
            if (l == minLength){
                System.out.println(each);
            }
        }

    }
}
