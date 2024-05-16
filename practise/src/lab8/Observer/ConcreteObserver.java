package src.lab8.Observer;

public class ConcreteObserver implements Observer {
    private final String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Наблюдатель " + name + " получил сообщение: " + message);
    }
}
