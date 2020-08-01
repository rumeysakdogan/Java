package day32_MethodOverLoading;
/*
 write a method that can return the full name of a person in regular format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"

 */
public class FormatFullName {

    public static void main(String[] args) {

        String first = "cYbErTeK";
        String last = "SCHOOL";

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first + " " + last;

        System.out.println(fullName);
    }

    public static String formatFullName(String first, String last){

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();

        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first + " " + last;

        return fullName;
    }
}

