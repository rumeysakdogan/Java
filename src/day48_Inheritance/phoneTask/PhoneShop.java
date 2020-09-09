package day48_Inheritance.phoneTask;
/*
 5. create a class called phone objects:
                         create three objects of each phone and test everything out
 */
public class PhoneShop {  // PhoneShop HAS-AN Iphone
    public static void main(String[] args) {

        Iphone iphone = new Iphone("11 Pro", 1000);

        iphone.call(911);
        iphone.text(123456);

        System.out.println(iphone);

        System.out.println("================================");

        Samsung samsung = new Samsung("Galaxy Note20", 1100);

        System.out.println(samsung);
        samsung.call(3452627);
        samsung.text(2313131);

        System.out.println("===========================");

        Nokia nokia =   new Nokia("N95",250);
        nokia.call(214234);
        nokia.call(341312);
        System.out.println(nokia);

    }
}
