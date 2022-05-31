package zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Figure> figureList = new ArrayList<>();
        figureList.add(new Rectangle(2, 3, "Prostokąt1"));
        figureList.add(new Circle(2, "Koło1"));
        figureList.add(new Figure("Figura1"));

        System.out.println("Figury:\n");
        for(Figure figure : figureList){
            System.out.println(figure.getName() + ": obwód = " + figure.getPerimeter() + "; powierzchnia = " + figure.getArea());
        }
    }
}
