package day43_Static;

import day42_static.Developers;
import day42_static.Testers;

public class StaticBlock2 {

    static int a;
    static String b;
    static Testers tester1;
    static Developers developer1;

    // static ExcelSheet excel = ;

    // if initialization of static variable takes more than one step, you need to initialize inside the static block

    static {
        a = 100;
        b = "Cybertek";
        tester1 = new Testers();
        tester1.setInfo("Ali",'M',1234,"SDET",100000);

        developer1 = new Developers();
        developer1.setInfo("Jay",'F',1874,"FullStack Dev",150000);
        System.out.println( tester1);
        System.out.println(developer1);
    }

    public static void main(String[] args) {

        System.out.println(a);
        System.out.println(b);
    }
}
