package src.lab8.Observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        ConcreteObserver observer1 = new ConcreteObserver("Первый");
        ConcreteObserver observer2 = new ConcreteObserver("Второй");

        // Добавляем наблюдателей к наблюдаемому объекту
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Отправляем сообщение наблюдателям
        subject.notifyObservers("Новое сообщение!");
    }
}
