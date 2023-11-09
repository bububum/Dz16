import model.Circle;
import model.Rectangle;
import model.Triangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Circle", 4);

        Rectangle rectangle = new Rectangle("Rectangle", 3, 4);

        Triangle triangle = new Triangle("Triangle", 2, 3, 4, 2);

        System.out.println("Название фигуры: " + circle.getShapeName());
        System.out.println("Периметр фигуры: " + circle.calcPerimeter());
        System.out.println("Площадь фигуры: " + circle.calcArea());
        System.out.println();

        System.out.println("Название фигуры: " + rectangle.getShapeName());
        System.out.println("Периметр фигуры: " + rectangle.calcPerimeter());
        System.out.println("Площадь фигуры: " + rectangle.calcArea());
        System.out.println();

        System.out.println("Название фигуры: " + triangle.getShapeName());
        System.out.println("Периметр фигуры: " + triangle.calcPerimeter());
        System.out.println("Площадь фигуры: " + triangle.calcArea());
    }
}