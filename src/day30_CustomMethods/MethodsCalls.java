package day30_CustomMethods;

import library.Util;

public class MethodsCalls {

    public static void main(String[] args) {

        String str = "aaaaabccccccgddddf";

        String nonDup = Util.removeDuplicates(str);

        System.out.println( nonDup );
    }
}
