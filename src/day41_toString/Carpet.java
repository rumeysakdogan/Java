package day41_toString;
/*
 1. create a custom class for the carpet class that should contain the following:

                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isPersian
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        getCarpetInfo: should be able to display all the info of the carpet including the total cost
                        of the carpet as calculated by calcCost()
            total price of carpet= (width*length)*unitprice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice

 */
public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;;
        return (isPersian) ? (totalPrice + 200) : totalPrice;
    }

    public void getCarpetInfo(){
        System.out.println("=========================================");
        System.out.println("Width: " + width); // you need to use this.width if there is a var sharing same name as width
        System.out.println("Length: " + length);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Price: " + calcCost());
        System.out.println("Persian Carpet: " + isPersian);
        System.out.println("=========================================");
    }

    // purpose of toString() method: to be able to print object by calling this method

    public String toString(){
        return "Width: "+width+", Length: "+length+", Unit Price: "+unitPrice+", Persian Carpet: "+isPersian;
    }
}
