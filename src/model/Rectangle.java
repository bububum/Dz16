package model;

public class Rectangle extends Share{

    private double a;
    private double b;

    public Rectangle(String shapeName, double a, double b) {
        super(shapeName);
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calcPerimeter() {
        double result = a + a + b + b;
        return result;
    }

    @Override
    public double calcArea() {
        double result = a * b;
        return result;
    }
}
