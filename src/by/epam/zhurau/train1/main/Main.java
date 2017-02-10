package by.epam.zhurau.train1.main;

import by.epam.zhurau.train1.shape.Shape;
import by.epam.zhurau.train1.shape.Circle;

import java.util.Scanner;

/**
 * Created by Dzmitry_Zhurau on 2/10/2017.
 */
public class Main {


    public static void main (String[] args){

        IDataReader iread = choiceDataReader();
        double val = iread.loadValue();
        Shape figure = new Circle(val);
        figure.getSquare();
        figure.getLength();
        System.out.println(figure.printResult());
    }


    private static IDataReader choiceDataReader( ){
        Scanner scanner = new Scanner(System.in);
        IDataReader iReader;
        int x = 0;
        while (x != 1 && x !=2) {
            System.out.print("Enter 1 for Console or 2 for File:");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                if (x != 1 && x != 2) {
                    System.out.println("The value is incorrect...");
                }
            } else {
                scanner.next();
                System.out.println("The value is incorrect...");
            }
        }
        if (x == 0){
           iReader = new ConsoleDataLoad();
        }else{
            iReader = new FileDataLoad();
        }
        return iReader;

    }



}
