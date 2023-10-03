package Shapes;

import Interfaces.Figure;

public class Сircle extends Figure {

    private double radius;

    public Сircle(double radius) throws RuntimeException {
        if (radius <= 0) {
            throw new RuntimeException("Error: all side length of сircle must have positive value");
        }

        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double calcPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String getInfo() {
        return "Сircle with " + radius + ", " + " has area: " + calcArea() + " and perimeter: "
                + calcPerimeter();
    }
}
