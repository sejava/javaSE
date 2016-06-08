package mazur.goit.module4.points;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pan on 07.06.16.
 */
public class Test {
    public static void main(String[] args) throws IOException {


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

            Point point1 = new Point(x1,y1);
            Point point2 = new Point(x2,y2);
            System.out.println("Відстань між координатами - " + DistanceCalculator.calculate(point1,point2));

        }catch (NumberFormatException ex){
            System.out.println("Eror not found value (x,x1,y,y1) or you write (A,a,B,b,C,c...) repeat ");
        }
    }
}
