package src.lab7.Flyweight;

public class Square implements Shape {
    private final String color;
    private final int x;
    private final int y;
    private final int side;

    public Square(String color) {
        this.color = color;
        this.x = 5;
        this.y = 5;
        this.side = 5;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем квадрат с цветом " + color + " в точке (" + x + ", " + y + ") со стороной " + side);
    }
}
