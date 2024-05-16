package src.lab6.Prototype;

// Пример использования
public class Main {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Прототип");
        ConcretePrototype clonedPrototype = (ConcretePrototype) prototype.clonePrototype();
        System.out.println("Имя клонированного прототипа: " + clonedPrototype.name);
    }
}
