package day03_sequences_Variables;

public class EscapeSequences
{
    public static void main(String[] args)
    {

        System.out.println("Hello Everyone \n\tMy name is Cybertek");
        System.out.println("\t\tI am in Albuquerque\n");
        System.out.println("\n\n\t\t\tI love programming");

        System.out.println("\\"); // prints one backslash
        System.out.println("/");  // prints one front slash


        System.out.println("\\\\"); // prints two backslashes
        System.out.println("//");  // prints two front slash

        System.out.println("\nMy name is \'Rumeysa\'"); // 'Rumeysa'
        System.out.println("My name is 'Rumeysa'");  // 'Rumeysa (prefer this one)

        System.out.println("\tI a \"33\" years old");


    }

}
