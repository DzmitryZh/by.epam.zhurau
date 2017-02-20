package by.epam.zhurau.train1.main;

import by.epam.zhurau.train1.action.CircleAction;
import by.epam.zhurau.train1.datareader.IDataReader;
import by.epam.zhurau.train1.shape.Shape;
import by.epam.zhurau.train1.shape.Circle;
import by.epam.zhurau.train1.datareader.ChoiceDataReader;


/**
 * Created by Dzmitry_Zhurau on 2/10/2017.
 */
public class Main {


    public static void main (String[] args){

        IDataReader iread = ChoiceDataReader.choiceDataReader();
        double val = iread.loadValue();
        Shape figure = new Circle(val);
        CircleAction circleAction = new CircleAction(figure);

        circleAction.calculateSquare();
        circleAction.calculateLength();
        System.out.println(circleAction.toString());
    }






}
