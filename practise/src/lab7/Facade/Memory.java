package src.lab7.Facade;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Память: загрузка данных на " + position);
    }
}
