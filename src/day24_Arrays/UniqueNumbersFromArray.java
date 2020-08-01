package day24_Arrays;
/*
  1. write a program that can print out the unique numbers from an array of integers

    Ex:
        int[] arr ={1,1,2,3,3,4}

        output:
            2 4

 */
public class UniqueNumbersFromArray {
    public static void main(String[] args) {

        int[] arr ={1,1,2,3,3,4, 9, 8, 8, 0};
        String result = "";

        for (int j = 0; j < arr.length ; j++) {
            int n1 = arr[j];
            int count = 0;

            for (int i = 0; i < arr.length; i++) {

                int each = arr[i];

                if (n1 == each) {
                    count++;
                }
            }
            if (count == 1) {
                result += n1+" ";
            }
        }


        System.out.println(result);



    }
}
