package day39_CustomClass;

public class CarMax {

    public static void main(String[] args) {

        Car car1 = new Car("Lexus","RX350",2019,"Red",14000,45000);
        Car car2 = new Car("Lexus","RX450",2020,"White",1000,50000);
        Car car3 = new Car("Bugatti","Veyron",2018,"Black",23000,500000);
        Car car4 = new Car("Ford","Escape", 2018,"White",25000,20000);
        Car car5 = new Car("Honda", "Accord", 2014, "Silver", 105000, 10000);

        car1.getInfo();
        car2.getInfo();
        car3.getInfo();
        car4.getInfo();
        car5.getInfo();

        car3.start();
        car5.start();



    }
}
