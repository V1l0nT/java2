package src.lab7.Flyweight;

public class Circle implements Shape {
    private final String color;
    private final int x;
    private final int y;
    private final int radius;

    public Circle(String color) {
        this.color = color;
        this.x = 0;
        this.y = 0;
        this.radius = 10;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг с цветом " + color + " в точке (" + x + ", " + y + ") с радиусом " + radius);
    }
}
