package src.lab6.FactoryMethod;

// Конкретная реализация продукта
public class ConcreteProduct implements Product {
    @Override
    public void operation() {
        System.out.println("Операция конкретного продукта");
    }
}