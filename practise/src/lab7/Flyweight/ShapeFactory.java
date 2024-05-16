package src.lab7.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String type, String color) {
        String key = type + color;
        Shape shape = shapeMap.get(key);
        if (shape == null) {
            switch (type) {
                case "Круг":
                    shape = new Circle(color);
                    break;
                case "Квадрат":
                    shape = new Square(color);
                    break;
            }
            shapeMap.put(key, shape);
            System.out.println("Создан новый объект " + type + " с цветом " + color);
        }
        return shape;
    }
}
