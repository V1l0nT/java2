package src.lab6.FactoryMethod;

// Пример использования
public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        product.operation();
    }
}