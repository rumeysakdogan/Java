package day57_Polymorphism.phoneTask;

public class Huawei extends Phone implements AndroidApp, AppleApp, Downloadable{

    public Huawei(String model, String size, double price) {
        super("Huawei", model, size, price);
        if(price > 200){
            throw new RuntimeException("No way Huawei does nto worth more than 200");
        }
    }

    @Override
    public void download() {
        System.out.println("Huawei is downloading apps from " + AndroidApp.AppStoreName +" and "+AppleApp.AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Huawei is texting to "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Huawei is calling "+phoneNumber);
    }

    public void stealInfo(){
        System.out.println("Huawei is stealing info from Apple and Android");
    }

    @Override
    public String toString() {
        return "Huawei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}
