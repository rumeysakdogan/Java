package day25_Practices;

// Write a program that can return the longest string of text from a String array

public class ShortestString2_for {

    public static void main(String[] args) {
        String[] names = {"Anam", "Nickolas", "Amir", "Zeynep", "Nurmamet"};

        int minLength = names[0].length();


        for (int i = 0; i < names.length; i++){// to find the minLength
            int l = names[i].length();
            if (minLength > l){
                minLength = l;
            }
        }

        System.out.println(minLength);

        for (int i = 0; i < names.length ; i++){       // to find the strings who has minlength
            int l = names[i].length();
            if (l == minLength){
                System.out.println(names[i]);
            }
        }

    }
}
