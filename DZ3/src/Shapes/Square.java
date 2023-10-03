package Shapes;

import Interfaces.Figure;

public class Square extends Figure {

    private double sideA;

    public Square(double sideA) throws RuntimeException {
        if (sideA <= 0) {
            throw new RuntimeException("Error: all side length of square must have positive value");
        }

        this.sideA = sideA;
    }

    @Override
    public double calcArea() {
        return Math.pow(sideA, 2);
    }

    @Override
    public double calcPerimeter() {
        return sideA * 4;
    }

    @Override
    public String getInfo() {
        return "Square with " + sideA + ", " + " has area: " + calcArea() + " and perimeter: "
                + calcPerimeter();
    }
}
