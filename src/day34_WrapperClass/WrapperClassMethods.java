package day34_WrapperClass;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";
        int a = Integer.parseInt(str);  // 123

        System.out.println(str + 1); // concatenates 1 to string: 1231
        System.out.println( a + 1); // adds 1 to integer: 124

                       // double 7.5
        Double d = Double.parseDouble("7.5");
//                 parse method ALWAYS returns a primitive

        System.out.println( d - 1); // 6.5

        String str2 = "TRUE";  // parse method ignores case sensitivity
        boolean bool = Boolean.parseBoolean(str2);
                      //     boolean true
        System.out.println( !bool );

        System.out.println("==============================================");

        String s2 = "100000.5";
//                   valueOf method returns ALWAYS wrapper class
        double d2 = Double.valueOf(s2);  // unboxing, automatically done

        System.out.println( d2 * 2 );

        String s3 = "FaLSe";
                        // false
        boolean b1 = Boolean.valueOf(s3);

        System.out.println( !b1 );












    }
}
