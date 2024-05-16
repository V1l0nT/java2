package src.lab4;

public class Test {
    public static void main(String[] args) {
        // Создаем экземпляр CustomExecutorService с двумя потоками
        CustomExecutorService executorService = new CustomExecutorService(2);

        // Создаем несколько задач для выполнения
        Runnable task1 = () -> {
            System.out.println("Задача 1 начата потоком " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Задача 1 завершена");
        };

        Runnable task2 = () -> {
            System.out.println("Задача 2 начата потоком "  + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Задача 2 завершена");
        };

        Runnable task3 = () -> {
            System.out.println("Задача 3 начата потоком "  + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Задача 3 завершена");
        };

        // Передаем задачи на выполнение
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);

    }
}