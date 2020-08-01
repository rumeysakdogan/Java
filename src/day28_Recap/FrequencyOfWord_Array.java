package day28_Recap;
/*
write a program that can count the frequency of a word from an array of string
            Ex:
                arr: {"Java", "C#", "Python", "Java"};
                word: "java"
                output:
                        2
            MUST USE for each loop, continuw

 */
public class FrequencyOfWord_Array {
    public static void main(String[] args) {

        String[] arr = {"Java", "C#", "Python", "Java"};
        String word = "java";
        int count = 0;


        for (String each : arr) {
           if( !each.equalsIgnoreCase(word) ){
               continue;
            }
            count++;
        }

        System.out.println(count);
    }
}
