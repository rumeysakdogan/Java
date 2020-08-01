package day31_Recap;

public class Methods_Practice2 {

    public static void main(String[] args) {

        String name = "madam";

        reverse1(name);

        String reversed = reverse2(name);
        System.out.println(  reverse2(name)   );
        System.out.println(   name.equalsIgnoreCase(reversed)  );

    }

    public static void reverse1(String str){

        String result = "";
        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }

        System.out.println(result);
    }

    public static String reverse2(String str){

        String result = "";
        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }

        return result;
    }

}
