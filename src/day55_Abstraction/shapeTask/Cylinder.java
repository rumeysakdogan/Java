package day55_Abstraction.shapeTask;

import java.text.DecimalFormat;

/*
 4. create a sub class of shape called Cylinder
            attributes: radius, height, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods
            add a constructor that takes two arguments for r & h of the cylinder  and initialize the instance variables: radius, height, perimeter, area, and volume
            add a static block that can initialize the static variables of the cylinder
 */
public final class Cylinder extends Shape{

   public double radius;
   public double height;

    public Cylinder(double radius, double height) {
        if ( radius <= 0 || height <= 0){
            throw new RuntimeException("Radius and height should be more than 0");
        }
        this.radius = radius;
        this.height = height;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
        name = "Cylinder";
        hasVolume = true;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * (Math.pow(radius,2) +  radius * height);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * Math.PI * (2 + height);
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius,2) * height;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter)+
                ", volume=" + df.format(volume) +
                '}';
    }

}
