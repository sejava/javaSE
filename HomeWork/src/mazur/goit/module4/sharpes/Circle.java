package mazur.goit.module4.sharpes;

/**
 * Created by pan on 07.06.16.
 */
public class Circle implements Shape {
    private double r;
    private double d;
    public double getR() {
        return r;
    }

    public Circle(double r, double d) {
        this.r = r;
        this.d = d;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {

        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public double calculArea() {
        return (r * r) * Math.PI;
    }

    public double kwadrat2(double d) {
        double resul = 0.25 * Math.PI * (d * d);
        return resul;

    }

}
