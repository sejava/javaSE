package goit.module4.ploszcza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pan on 07.06.16.
 */
public class ShapeAreaCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Виберіть фігуру: ");
        System.out.println("1 - трикутник");
        System.out.println("2 - прямокутник");
        System.out.println("3 - круг ");
        try {

            int i = Integer.parseInt(reader.readLine());
            if (i == 1) {
                System.out.println("Введіть розмір сторін (a, h) :" +
                        "\n нп: " +
                        "\n 14" +
                        "\n 12");
                double a = Double.parseDouble(reader.readLine());
                double h = Double.parseDouble(reader.readLine());
                Shape triangle = new Triangle(a, h);
                System.out.println("Площа трикутника - " + triangle.calculArea());
            } else if (i == 2) {
                System.out.println("Введіть сторону a");
                double a = Double.parseDouble(reader.readLine());
                System.out.println("і сторону b");
                double b = Double.parseDouble(reader.readLine());
                Shape ractangle = new Rectangle(a, b);
                System.out.println("Площа прямокутника - " + ractangle.calculArea());
            } else if (i == 3) {
                System.out.println("Виберіть Формулу площі круга: \n 1 - Формула площі круга через радіус\n 2 - Формула площі круга через діаметр ");
                int formula = Integer.parseInt(reader.readLine());
                if (formula == 1) {
                    System.out.println("Введіть радіус круга");
                    double radius = Double.parseDouble(reader.readLine());
                    Shape circle = new Circle(radius);
                    System.out.println("Площа круга - " + circle.calculArea());
                }
                else {
                    System.out.println("Введіть діамтр круга");
                    double diamtr = Double.parseDouble(reader.readLine());
                    Circle circle = new Circle(diamtr);
                    System.out.println("Формула площі круга через діаметр = " + circle.kwadrat2(diamtr) );
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("EROR! Pleas Write nubmers");
        }
    }
}


