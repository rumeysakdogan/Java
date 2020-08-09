package day39_CustomClass;

public class Car {
    /*
        Attributes:
            model, year, brand, color, mileage, price...
     */
// instance variables are defined outside of methods.We give attributes inside of instance variables

    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

// instance methods do not have STATIC specifier.Instance methods are specific to instance objects.
// We give actions/functions inside of instance methods.

    public void setInfo(String carBrand, String carModel, int carYear,String carColor, double carMileage,double carPrice ){
        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;
    }
    // sets the info of car object

    //2012 Toyota Corolla, Red, 10000, $45000
    public void getInfo(){
        System.out.println(year+" "+brand+" "+model+", "+color+", "+mileage+", $"+price);
    }
    // prints the carInfo


}
