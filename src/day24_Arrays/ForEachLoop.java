package day24_Arrays;

/*
        for ( DataType each : Collection of Data ) {
                System.out.print( each + " " );
        }

 */
public class ForEachLoop {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8,9 , -1, -2, -3};

        for (int i = 0; i < arr.length ; i++){      // i is the index number
            System.out.print( arr[i]+" " );
        }

        System.out.println("\n======================");

        for ( int each : arr ){                     // each represents every single element of the collection
            System.out.print( each + " " );
        }

        System.out.println("\n======================");

        String[] groupMates = {"Bulent", "Agit", "Altynai", "Malek", "Ibrahim", "Roman", "Vlad", "Dusan", "Rumeysa", "Shirzad"};

        for (String each : groupMates) {
            System.out.print( each + ", " );
        }

    }
}
