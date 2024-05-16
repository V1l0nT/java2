package src.lab6.Prototype;

// Конкретная реализация прототипа
public class ConcretePrototype extends Prototype {
    public ConcretePrototype(String name) {
        super(name);
    }

    @Override
    public Prototype clonePrototype() {
        return new ConcretePrototype(name);
    }
}
