package zad1;

public class Rectangle extends Figure {

    double widthA;
    double widthB;

    public Rectangle(double widthA, double widthB, String name) {
        super(name);
        this.widthA = widthA;
        this.widthB = widthB;
    }

    public double getArea(){
        return widthA * widthB;
    }

    public double getPerimeter(){
        return 2*(widthA + widthB);
    }
}
