package by.epam.zhurau.train1.action;

import by.epam.zhurau.train1.shape.Circle;
import by.epam.zhurau.train1.shape.Shape;

/**
 * Created by Dzmitry_Zhurau on 2/13/2017.
 */
public class CircleAction  {

    private Circle circle;

    public CircleAction(Shape circle){
        this.circle = (Circle) circle;
    }

    public double calculateSquare() {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }


    public double calculateLength() {
        return 2 * Math.PI * circle.getRadius();
    }

    public String toString(){
        return "Circle with radius: " + circle.getRadius() +"; Length: " + calculateLength() + "; Square: " + calculateSquare();
    }

}
