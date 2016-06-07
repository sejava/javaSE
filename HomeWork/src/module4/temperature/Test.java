package goit.module4.temperature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static goit.module4.Gdarus.celsij;
import static goit.module4.Gdarus.faring;

/**
 * Created by pan on 07.06.16.
 */
public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть C для перетвореня в градуси цельсія в фарінгейта");
        System.out.println("Введіть F для перетвореня в фарінгейта в цельсія");
        String s = reader.readLine();
        try {
            if (s.equals("F") || s.equals("f")) {
                double t = Double.parseDouble(reader.readLine());
                System.out.println(TemperatureConverter.convertFarengeitToCelsium(t));
            } else if (s.equals("C") || s.equals("c")) {
                double t = Double.parseDouble(reader.readLine());
                System.out.println(TemperatureConverter.convertFarengeitToCelsium(t));
            } else if (!s.equals("C") || !s.equals("c") || !s.equals("F") || !s.equals("f")){
                throw new IllegalStateException(s);
            }
        }
        catch (IllegalStateException ex){
            System.out.println("EROR write agin 'C' or 'F' ");
        }
        catch ( NumberFormatException ex1){
            if (ex1 != null){
                System.out.println("EROR write number please");
            }
        }

    }
}
