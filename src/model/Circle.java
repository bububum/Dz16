package model;

public class Circle extends Share{

    private int radius;

    public Circle(String shapeName, int radius) {
        super(shapeName);
        this.radius = radius;
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calcPerimeter() {
        double result = 2  * radius * Math.PI;
        return result;
    }

    @Override
    public double calcArea() {
        double result = Math.PI * (radius * radius);
        return result;
    }
}
