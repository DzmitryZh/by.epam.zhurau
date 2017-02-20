package by.epam.zhurau.train1.datareader;

import java.util.Scanner;

/**
 * Created by Dzmitry_Zhurau on 2/10/2017.
 */
public class ConsoleDataLoad implements IDataReader {
    public double loadValue(){
        Scanner scanner = new Scanner(System.in);
        double x = 0.0;
        while (x == 0.0) {
            System.out.print("Enter radius:");
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
                if (x <= 0.0){
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
