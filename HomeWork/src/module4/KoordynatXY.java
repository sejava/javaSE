package goit.module4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * Created by pan on 05.06.16.
 */
public class KoordynatXY {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
    }


}
