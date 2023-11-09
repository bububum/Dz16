package model;

public class Triangle extends Share{

    private double a;
    private double b;
    private double main;
    private double height;

    public Triangle(String shapeName, double a, double b, double main, double height) {
        super(shapeName);
        this.a = a;
        this.b = b;
        this.main = main;
        this.height = height;
    }

    public Triangle() {
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

    public double getMain() {
        return main;
    }

    public void setMain(double main) {
        this.main = main;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcPerimeter() {
        double result = a + b + main;
        return result;
    }

    @Override
    public double calcArea() {
        double result = (height * main) / 2;
        return result;
    }
}
