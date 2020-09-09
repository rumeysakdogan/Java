package day48_Inheritance.phoneTask;
/*
3. create a subclass of Phone called Samsung
                initialize all the variables using constructor & static block
                methods: call, text, selfie, setInfo, toString, freeze
 */
public class Samsung extends Phone {

    static {
        brand = "Samsung";
        madeIn = "Korea";
    }

    public Samsung(String model, double price) {

        super(model,price);
    }


    @Override
    public void call(long phoneNumber) {
        System.out.println("Samsung "+model + " is calling "+phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {

        System.out.println("Samsung "+model + " is texting " + phoneNumber);
    }


}
