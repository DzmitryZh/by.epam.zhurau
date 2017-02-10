package by.epam.zhurau.train1.main;

import by.epam.zhurau.train1.shape.Shape;
import by.epam.zhurau.train1.shape.Circle;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Dzmitry_Zhurau on 2/10/2017.
 */
public class Main {
    public static void main (String[] args){
        double val ;

        val = enterRadius();

        Shape figure = new Circle(val);
        figure.getSquare();
        figure.getLength();
        System.out.println(figure.printResult());

    }


    private static double enterRadius() {
        Scanner scanner = new Scanner(System.in);
        double x = 0.0;
        while (x == 0.0) {
            System.out.print("Enter radius:");
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
                if (x < 0.0){
                    x = 0.0;
                    System.out.println("The value is incorrect...");
                }
            }else{
                scanner.next();
                System.out.println("The value is incorrect...");
            }
        }
        return x;
    }



}
