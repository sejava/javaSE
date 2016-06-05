package goit.module4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pan on 05.06.16.
 */
public class Gdarus {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть C для перетвореня в градуси цельсія в фарінгейта");
        System.out.println("Введіть F для перетвореня в фарінгейта в цельсія");
        String s = reader.readLine();
        if (s.equals("F") || s.equals("f")) {
            double t = Double.parseDouble(reader.readLine());
            System.out.println(faring(t));
        } else if (s.equals("C") || s.equals("c")) {
            double t = Double.parseDouble(reader.readLine());
            System.out.println(celsij(t));
        } else {
            System.out.println("EROOR");
        }
    }

    public static double celsij(double c) {
        return c * 9 / 5 + 32;
    }

    public static double faring(double f) {
        return ((f - 32) * 5) / 7;
    }
}
