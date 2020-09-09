package day48_Inheritance.phoneTask;
/*
  2. create a subclass of Phone called iPhone
                initialize all the variables using constructor & static block
                methods: call, text, selfie, setInfo, toString, faceTime
 */
public class Iphone extends Phone{

    static{
        brand = "Iphone";
        madeIn = "USA";
    }
    public Iphone(String model, double price){
        super(model,price);
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println("iPhone "+model + " is calling "+phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println("iPhone "+model + " is texting " + phoneNumber);
    }


}
