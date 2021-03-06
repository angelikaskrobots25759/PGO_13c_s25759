package tutorial6.zad3;

public class LinearFunction extends Function implements Fun{

    private double a;
    private double b;

    public LinearFunction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double f(double x) {
        return a*x+b;
    }

    @Override
    public void increaseCoefficientsBy(double delta) {
        a = a+delta;
        b = b+delta;
    }

    @Override
    public void decreaseCoefficientsBy(double delta) {
        a = a-delta;
        b = b-delta;
    }
}
