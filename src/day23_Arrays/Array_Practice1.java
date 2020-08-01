package day23_Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {

        //String students = "Bob", "John", "Kate", "Daisy", "Muhtar";


        String[] students = {"Bob", "John", "Kate", "Daisy", "Muhtar"};
        //  index numbers:     0      1       2        3        4

        String name1 = students[4];

        System.out.println(name1);

        System.out.println("=========================================");

        String[] names = { "Mike", "Adam", "Tonny", "John", "Amy"};     // size: 5
        //                   0        1       2        3     4

        int[] scores = { 85,    70,     95,     90,     100 };          // size: 5
        //                0      1       2       3       4

        for (int i = 0; i <= names.length -1; i++) {

            System.out.println( names[i] + " : " + scores[i] );

        }

        System.out.println("=========================================");

        String[] classMates = new String[5];

        classMates[0] = "Asiya";
        classMates[2] = "Nadir";
        classMates[1] = "Saim";
        classMates[3] = "Virginia";
        classMates[4] = "Fatih";

        for (int i = 0; i < classMates.length; i++) {

            System.out.println( classMates[i] );

        }

        System.out.println("=========================================");

    }
}
