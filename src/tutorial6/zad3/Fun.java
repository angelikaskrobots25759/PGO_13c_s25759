package tutorial6.zad3;

public interface Fun {
    double f(double x);

    static double minimum(Fun func, double a, double b, double alpha) {
        double tmp = func.f(a);
        for(double x=a;x<b;x+=alpha)
            if(tmp > func.f(x))
                tmp = func.f(x);
        return tmp;
    }
}
