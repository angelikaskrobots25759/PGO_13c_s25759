package zad1;

public class Circle extends Figure {

    double radius;

    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
