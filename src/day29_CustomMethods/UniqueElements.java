package day29_CustomMethods;
// write a method that can print out the unique elements from an array of string
public class UniqueElements {

    public static void main(String[] args) {

        String arr[] = {"banana", "cat","apple" ,"cat", "banana","cherry", "melon"};

        uniques(arr);

    }

    public static void uniques(String[] arr){

        for (String each : arr){
            int count = 0;
            for (String i : arr){
                if (each.equals(i)){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(each+" ");
            }
        }
        System.out.println();
    }

}
