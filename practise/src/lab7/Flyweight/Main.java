package src.lab7.Flyweight;

public class Main {
    public static void main(String[] args) {
        example();
    }

    private static void example() {
        System.out.println("Пример:");
        Shape circle1 = ShapeFactory.getShape("Круг", "Красный");
        circle1.draw();
        Shape circle2 = ShapeFactory.getShape("Круг", "Красный");
        circle2.draw();
        Shape square1 = ShapeFactory.getShape("Квадрат", "Синий");
        square1.draw();
    }
}