package day56_Abstraction.shapeTask;

public class Square extends Shape{

    public double side;

    public Square(double side) {
        if(side <= 0){
            throw new RuntimeException("Side of square cannot be negative or zero");
        }
        this.side = side;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
