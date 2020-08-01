package day24_Arrays;

public class UniqueWords {
    public static void main(String[] args) {


        String[] words = {"C#", "C#", "Java", "Python", "Python", "C++"};
        String result = "";

        for (int i = 0; i < words.length; i++){

            String w1 = words[i];
            int count = 0;

            for (int j = 0; j < words.length; j++){
                String each = words[j];
                if ( w1.equals(each)){
                    count++;
                }
            }

                if (count == 1){
                    result += w1+"\n";
                }
        }

        System.out.println(result);
    }
}
