package mazur.goit.module4.sharpes;

/**
 * Created by pan on 07.06.16.
 */
public class Triangle implements Shape{
    private double aDouble;
    private double hDouble;

    public Triangle(double aDouble, double hDouble) {
        this.aDouble = aDouble;
        this.hDouble = hDouble;
    }

    public double getaDouble() {

        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public double gethDouble() {
        return hDouble;
    }

    public void sethDouble(double hDouble) {
        this.hDouble = hDouble;
    }

    @Override
    public double calculArea() {
        return (this.aDouble * this.hDouble) / 2;
    }
}
