package day15_String;

public class substring_Method {

    public static void main(String[] args) {

        String sentence = "Java is fun";
                        // 012345678910

        String word = sentence.substring(0,4);

        System.out.println(word);

        String word2 = sentence.substring(8,11);

        System.out.println(word2);

        System.out.println("---------------------");

        String sentence2 = "I like Movies and TV Series";
        //                  0123456789

        String word3 = sentence2.substring(7,13);

        System.out.println(word3);

        System.out.println("---------------------");

        String firstName = "MUHTAR";

        firstName = firstName.substring(0,1) + firstName.substring(1).toLowerCase();

        System.out.println(firstName);

        System.out.println("---------------------");

        String lastName = "cYNTHiA";
        String firstChar = lastName.substring(0,1); // s
        String remaining = lastName.substring(1); // chool : starting from index 1 till to the end of string

        lastName = firstChar.toUpperCase() + remaining.toLowerCase();

        System.out.println(lastName);

        System.out.println("---------------------");

        String s = "I like Game of Thrones";
        //          01234567..
        String series = s.substring(7);
        System.out.println(series);


        String s2 = "I like Java Programming Language";
        String language = s2.substring(7);

        System.out.println(language);
    }
}
