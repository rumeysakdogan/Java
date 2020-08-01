package day29_CustomMethods;
/* write a method that can remove the duplicates from the string
        input: ababab
        output: ab
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        removeDuplicates("aaaaabbcddddefffff");
    }

    public static void removeDuplicates(String str){

        String result = "";

        for (String each : str.split("")){

            if (!result.contains(each)) {
                result += each;
            }
        }
        System.out.println(result);
    }
}
