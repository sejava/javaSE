package goit.module4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.Buffer;

/**
 * Created by pan on 05.06.16.
 */
public class KoordynatXY {
    public static void main(String[] args) throws IOException ,NumberFormatException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введіть координати: x1");
            int x1 = Integer.parseInt(reader.readLine());
            System.out.println("Введіть координати: y1");
            int y1 = Integer.parseInt(reader.readLine());
            System.out.println("Введіть координати: x2");
            int x2 = Integer.parseInt(reader.readLine());
            System.out.println("Введіть координати: y2");
            int y2 = Integer.parseInt(reader.readLine());

            double d = Math.sqrt(((x2 - x1) * (x2 - x1))+((y2 - y1) * (y2 - y1)));
            System.out.println("Відстань між координатами " + d);
        }catch (NumberFormatException ex){
            System.out.println("Eror not found value (x,x1,y,y1) or you write (A,a,B,b,C,c...) repeat ");
        }

    }



}
