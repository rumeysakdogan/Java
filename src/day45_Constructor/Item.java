package day45_Constructor;
/*
 Task01:
        create a class called Item
                instance variables:
                    name, unitPrice, quantity
                add a constructor that can initialize the fields
                instance methods:
                    calcCost(): returns the total cost as double
                                hint: quantity * unitPrice
                    toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */
public class Item {

    String name;
    double unitPrice;
    int quantity;

    // easy way: right click -> generate -> Constructor -> select all instance variables -> OK
    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return quantity * unitPrice;
    }

    public String toString(){
        return "Item Name: "+name+"\nUnit Price: "+unitPrice+"\nTotal Cost: "+calcCost();
    }
}
