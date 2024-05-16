package src.lab6.AbstractFactory;

// Конкретная реализация продукта В
public class ConcreteProductB implements ProductB {
    @Override
    public void operationB() {
        System.out.println("Операция конкретного продукта В");
    }
}
