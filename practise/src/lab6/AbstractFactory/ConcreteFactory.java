package src.lab6.AbstractFactory;

// Конкретная реализация абстрактной фабрики
public class ConcreteFactory implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB();
    }
}
