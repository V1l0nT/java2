package src.lab6.Prototype;

// Прототип, который будем клонировать
public abstract class Prototype implements Cloneable {
    protected String name;

    public Prototype(String name) {
        this.name = name;
    }

    public abstract Prototype clonePrototype();
}
