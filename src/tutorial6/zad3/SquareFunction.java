package tutorial6.zad3;

public class SquareFunction extends Function implements Fun{

    private double a;
    private double b;
    private double c;

    public SquareFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double f(double x) {
        return ((a*Math.pow(x, 2))+(b*x)+c);
    }

    @Override
    public void increaseCoefficientsBy(double delta) {
        a = a+delta;
        b = b+delta;
        c = c+delta;
    }

    @Override
    public void decreaseCoefficientsBy(double delta) {
        a = a-delta;
        b = b-delta;
        c = c-delta;
    }
}
