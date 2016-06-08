package mazur.goit.module4.temperature;

/**
 * Created by pan on 07.06.16.
 */
public class TemperatureConverter {
    public static double convertCelsiumToFarengeit(double celsiumDegree)
    {
        return ((9 / 5) * celsiumDegree + 32);
    }

    public static double convertFarengeitToCelsium(double celsiumDegree){
        return ((9 / 5) * celsiumDegree - 32);
    }
}
