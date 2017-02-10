package by.epam.zhurau.train1.main;

import java.io.*;
/**
 * Created by Dzmitry_Zhurau on 2/10/2017.
 */
public class FileDataLoad implements IDataReader  {
    public double loadValue ()  {

        double x;

        File file = new File("src/by/epam/zhurau/train1/Data/value.txt");
       // if (!file.exists()){
          //  throw new FileNotFoundException(file.getName());
       // }

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                String s = in.readLine();
                x = Double.valueOf(s);
                if (x < 0.0){
                    x = 0.0;
                    System.out.println("The value is incorrect...");
                    throw new RuntimeException();
                }
            } finally {
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        return x;
    }
}
