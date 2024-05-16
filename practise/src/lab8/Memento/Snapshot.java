package src.lab8.Memento;

public class Snapshot {
    private final String state;

    public Snapshot(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}