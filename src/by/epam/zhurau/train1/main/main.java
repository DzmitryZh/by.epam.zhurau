package by.epam.zhurau.train1.main;

import by.epam.zhurau.train1.shape.Shape;
import by.epam.zhurau.train1.shape.Circle;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Dzmitry_Zhurau on 2/10/2017.
 */
public class main {
    public static void main (String[] args){
        double val ;

        val = enterRadius();

        Shape figure = new Circle(val);
        figure.getSquare();
        figure.getLength();
        System.out.println(figure.printResult());

    }


    public static double enterRadius() {
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
/*
    public static String enterRadiusFromFile(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();

        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();



        try(FileInputStream fin=new FileInputStream("C://SomeDir//note.txt"))
        {
            System.out.println("Размер файла: " + fin.available() + " байт(а)");

            int i=-1;
            while((i=fin.read())!=-1){

                System.out.print((char)i);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }






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
*/
}
