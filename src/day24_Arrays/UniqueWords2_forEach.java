package day24_Arrays;

public class UniqueWords2_forEach {
    public static void main(String[] args) {

        String[] words = {"C#", "C#", "Java", "Python", "Python", "C++", "Ruby"};

        String result = "";

        for (String each : words) {

            int count = 0;

            for (String i : words) {
                if (each.equals(i)) {
                    count++;
                }
            }
            if (count == 1){
                result += each+"\n";
            }
        }

        System.out.println(result);


    }
}
