package day50_Inheritance_Overriding.carTask;

public class CarObjects {

    public static void main(String[] args) {

        Honda honda = new Honda();
        Mercedes mercedes = new Mercedes();
        Tesla tesla = new Tesla();
        Jeep jeep = new Jeep();
        BMW bmw = new BMW();

        honda.start();
        System.out.println("==================================");

        mercedes.start();
        System.out.println("==================================");

        tesla.start();
        System.out.println("==================================");

        jeep.start();
        System.out.println("==================================");

        bmw.start();
    }
}
