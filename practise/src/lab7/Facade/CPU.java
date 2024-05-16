package src.lab7.Facade;

public class CPU {
    public void freeze() { System.out.println("Процессор: остановка"); }
    public void jump(long position) { System.out.println("Процессор: переход на " + position); }
    public void execute() { System.out.println("Процессор: выполнение"); }
}
