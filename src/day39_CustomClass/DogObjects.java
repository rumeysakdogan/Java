package day39_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();


        dog1.setDogInfo("Siwan","Neapolitan Mastiff","Large",5,"Black");
        dog2.setDogInfo("Karabas","Maltese","Small",2,"White");
        dog3.setDogInfo("Joy","Chow Chow","Medium",3,"brown");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();


        dog1.eat("Kelle Paca");
        dog3.eat("Steak");
        dog2.eat("polo");

        dog3.drink("Cola");
        dog1.drink("Water");
        dog2.drink("Milk");

        dog1.sleep();
        dog2.sleep();
        dog3.sleep();

    }

}
