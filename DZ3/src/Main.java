import Interfaces.Figure;
import Shapes.Rectangle;
import Shapes.Square;
import Shapes.Triangle;
import Shapes.Сircle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figure> figures = new ArrayList<>();

        try {
            figures.add(new Triangle(3, 4, 5));
            figures.add(new Square(4));
            figures.add(new Сircle(4));
            figures.add(new Rectangle(4, 6));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        for (Figure item : figures) {
            System.out.println(item.getInfo());
        }

    }
}