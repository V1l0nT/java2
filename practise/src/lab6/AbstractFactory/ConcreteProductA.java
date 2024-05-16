package src.lab6.AbstractFactory;

// Конкретная реализация продукта А
public class ConcreteProductA implements ProductA {
    @Override
    public void operationA() {
        System.out.println("Операция конкретного продукта А");
    }
}
