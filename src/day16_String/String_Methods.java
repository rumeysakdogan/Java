package day16_String;

public class String_Methods {

    public static void main(String[] args) {

        // replace(old value, new value):

        String email = "cybertek@gmail.com";

        email = email.replace("gmail","yahoo");

        System.out.println(email);

        String word = "java";
        word = word.replace("a","e");

        String sentence = "I like to learn Java, Java is cool, Java is fun";

        sentence = sentence.replace("a, Java","a, C#");
        sentence = sentence.replace("Java ","Python ");

        sentence = sentence.replaceAll("\\s",""); // to get rid the space in between words

        System.out.println(sentence);

        String  s1 = "I would like to stay in Cybertek, Cybertek is nice place"; //MIT
        s1 = s1.replace("Cybertek","MIT");

        System.out.println(s1);

        String s2 = "I like to leaRn Java"; //r
        s2 = s2.replace('R','r');
        System.out.println(s2);

        // replaceFirst(oldValue,newValue) : replace first occurred old value by new value

        String s3 = "I like to drink tea and tea";

        s3 = s3.replaceFirst("tea","cola");

        System.out.println(s3);

        String s4 = "I like to watch Game of Thrones, and Walking Dead";

        s4 = s4.replace(", and Walking Dead","");

        System.out.println(s4);

        // indexOf(value) : used for finding the index # of specific character which occurs first

        String s5 = "I like to stay in Cybertek, we are learning Java";

        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re"); // to get the index # of specific r, you can make
                                         // it unique by adding letters after that character
        int r3 = s5.indexOf("rn");
        System.out.println(r3);

        // lastIndexOf() : gives the index # of last occurred specific character

        String s6 = "Java is a programming language, and Java is fun";

        int i1 = s6.lastIndexOf("J"); //  int i2 = s6.indexOf("Java is f"); gives same answer
        System.out.println(i1);

        int i2 = s6.lastIndexOf("A"); // if it returns a negative number,
                                         // it means that character does not exist in your string
        System.out.println(i2);


    }
}
