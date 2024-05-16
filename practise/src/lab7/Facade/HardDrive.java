package src.lab7.Facade;

public class HardDrive {
    public byte[] read(long position, int size) {
        System.out.println("Жесткий диск: чтение данных с " + position + " размером " + size);
        return new byte[size];
    }
}