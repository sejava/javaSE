package goit.module4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by pan on 05.06.16.
 */
public class Ploszcza {

    public static void main(String[] args) throws IOException,NumberFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Виберіть фігуру: ");
        System.out.println("1 - трикутник");
        System.out.println("2 - прямокутник");
        System.out.println("3 - круг ");
        try {

        int i = Integer.parseInt(reader.readLine());
        if(i == 1){
            System.out.println("Введіть розмір сторін (a, b, c) :" +
                    "\n нп: " +
                    "\n 14" +
                    "\n 12" +
                    "\n 12");
            double a = Double.parseDouble(reader.readLine());
            double b = Double.parseDouble(reader.readLine());
            double c = Double.parseDouble(reader.readLine());
            System.out.println("площа трикутника - " + trykutnyk(a,b,c));
        }else if (i == 2){
            System.out.println("Введіть сторону a");
            double a = Double.parseDouble(reader.readLine());
            System.out.println("і сторону b");
            double b = Double.parseDouble(reader.readLine());
            System.out.println("Площа прямокутника дорівнє : " + prjamokutnyk(a,b) );
        }else if (i == 3){
            System.out.println("Виберіть Формулу площі круга: \n 1 - Формула площі круга через радіус\n 2 - Формула площі круга через діаметр ");
            int formula = Integer.parseInt(reader.readLine());
            if (formula == 1){
                System.out.println("Введіть радіус круга");
                double radius = Double.parseDouble(reader.readLine());
                System.out.println("Формула площі круга через радіус = " + krug(radius));
            }else {
                System.out.println("Введіть діамтр круга");
                double diamtr = Double.parseDouble(reader.readLine());
                System.out.println("Формула площі круга через діаметр = " + krug2(diamtr));
            }
        }
        } catch (NumberFormatException ex){
            System.out.println("Pleas Write nubmers");
        }
    }

    public static double trykutnyk(double a, double b ,double c){
        double p = (a + b + c) / 2;
        double x = (p * (p - a) * (p - b) * (p - c));
        double s = Math.sqrt(x);

        return s;
    }


    public static double prjamokutnyk(double a,double b){
        return a * b;
    }

    public static double krug(double radius){
        return Math.PI * (radius * radius);
    }
    public static double krug2(double diamtr){
        double resul = 0.25 * Math.PI * (diamtr * diamtr);
        return resul;
    }



}
