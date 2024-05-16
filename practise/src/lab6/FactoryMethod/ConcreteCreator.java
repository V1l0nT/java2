package src.lab6.FactoryMethod;

// Конкретная реализация фабрики
public class ConcreteCreator implements Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
