package by.epam.zhurau.train1.shape;

/**
 * Created by Dzmitry_Zhurau on 2/10/2017.
 */
public class Circle extends  Shape{
    private double radius;

    private double square;

    private double length;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getSquare() {
        square = CalculateSquare();
        return square;
    }

    public double getLength() {
        length = CalculateLength();
        return length;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    private double CalculateLength(){
        return 2*Math.PI*radius;
    }

    private double CalculateSquare(){
        return Math.PI* Math.pow(radius,2);
    }

    public String printResult(){
        return "Circle with radius: " + radius +"; Length: " + getLength() + "; Square: " + getSquare();
    }

}
