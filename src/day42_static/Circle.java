package day42_static;

public class Circle {

    double radius;
    double diameter;
    static double pi = 3.14;

    public void setInfo(double radius){
        this.radius = radius;
        diameter = 2 * radius;
    }

    public double calcArea(){
        return pi * radius * radius;
    }

    public double calcCircumference(){
        return diameter * pi;
    }

    public String toString(){
        return "Radius: " + radius + "\nDiameter: " +diameter+"\nPi: "+pi+"\nArea: "+ calcArea()+"\nCircumference: "+ calcCircumference();
    }






}
