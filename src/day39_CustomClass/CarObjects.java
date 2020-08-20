package day39_CustomClass;

public class CarObjects {
    public static void main(String[] args) {

//   className  objectName = keyword   Constructor
        Car         car1   =   new      Car("Toyota","Corolla",2020,"White",20000,19000.50);
/*
            car1.brand = "Toyota";
            car1.model = "Corolla";
            car1.year = 2020;
            car1.color = "White";
            car1.mileage = 20000;
            car1.price = 19000.50;
*/

//      car1.setInfo("Toyota","Corolla",2020,"White",20000,19000.50);
        car1.getInfo();
/*
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
*/
        System.out.println("================================");

        Car car2 = new Car("BMW","G 550",2019,"Red",2700,35000);

 //     car2.setInfo("BMW","G 550",2019,"Red",2700,35000);
        car2.getInfo();
/*
            car2.brand = "BMW";
            car2.model = "G 550";
            car2.year = 2019;
            car2.color = "Red";
*/

        System.out.println("================================");

        Car car3 = new Car("Honda","Odessy",2014,"Blue",90000,3000);

  //    car3.setInfo("Honda","Odessy",2014,"Blue",90000,3000);
        car3.getInfo();


    }
}
