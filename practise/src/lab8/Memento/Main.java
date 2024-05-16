package src.lab8.Memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // Устанавливаем начальное состояние
        originator.setState("Начальное состояние");
        System.out.println("Текущее состояние: " + originator.getState());

        // Сохраняем снимок текущего состояния
        caretaker.setSnapshot(originator.saveToSnapshot());

        // Меняем состояние
        originator.setState("Измененное состояние");
        System.out.println("Текущее состояние: " + originator.getState());

        // Восстанавливаем предыдущее состояние из снимка
        originator.restoreFromSnapshot(caretaker.getSnapshot());
        System.out.println("Восстановленное состояние: " + originator.getState());
    }
}
