package day56_Abstraction.shapeTask;

public class Cube extends Shape implements Volume{

    public double side;

    public Cube(double side) {
        if (side <= 0){
            throw new RuntimeException("Side of a cube cannot be negative or zero.");
        }
        this.side = side;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(side,2);
    }

    @Override
    public double calculatePerimeter() {
        return side * 12;
    }


    @Override
    public double calculateVolume() {
        return Math.pow(side,3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
