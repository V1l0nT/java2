package src.lab8.Memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // Создаем снимок текущего состояния
    public Snapshot saveToSnapshot() {
        return new Snapshot(state);
    }

    // Восстанавливаем состояние из снимка
    public void restoreFromSnapshot(Snapshot snapshot) {
        state = snapshot.getState();
    }
}
