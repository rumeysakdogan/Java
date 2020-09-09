package day48_Inheritance.phoneTask;

public class Nokia extends Phone{

    static {
        brand = "Nokia";
        madeIn = "Finland";
    }

    public Nokia(String model, double price) {
        super(model, price);
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println("Nokia "+model + " is calling "+phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println("Nokia "+model + " is texting " + phoneNumber);
    }
}
