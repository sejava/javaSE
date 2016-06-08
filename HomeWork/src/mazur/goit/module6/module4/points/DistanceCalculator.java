package mazur.goit.module4.points;

/**
 * Created by pan on 07.06.16.
 */
public class DistanceCalculator {
    public static double calculate(Point point1, Point point2){

        return Math.sqrt(Math.pow((point1.getX() - point2.getX()), 2) + Math.pow((point1.getY() - point2.getY()), 2));
    }
}
