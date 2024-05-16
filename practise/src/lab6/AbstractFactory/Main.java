package src.lab6.AbstractFactory;

// Пример использования
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        ProductA productA = factory.createProductA();
        productA.operationA();
        ProductB productB = factory.createProductB();
        productB.operationB();
    }
}