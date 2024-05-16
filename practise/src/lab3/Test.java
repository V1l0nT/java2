package src.lab3;

public class Test {
    public static void main(String[] args) {
        // Пример использования SafeSet
        SafeSet<Integer> safeSet = new SafeSet<>();

        // Добавление элементов в SafeSet из нескольких потоков
        Thread thread1 = new Thread(() -> {
            try {
                safeSet.add(1);
                safeSet.add(2);
                safeSet.add(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                safeSet.add(4);
                safeSet.add(5);
                safeSet.add(6);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        // Ожидание завершения работы потоков
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Вывод размера SafeSet
        try {
            System.out.println("Размер SafeSet: " + safeSet.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Проверка наличия элементов в SafeSet
        try {
            System.out.println("SafeSet содержит не менее 5 элементов?: " + safeSet.contains(5));
            System.out.println("SafeSet содержит не менее 10 элементов?: " + safeSet.contains(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Удаление элементов из SafeSet
        try {
            System.out.println("Удаление 3 элементов из SafeSet: " + safeSet.remove(3));
            System.out.println("Удаление 7 элементов из SafeSet: " + safeSet.remove(7));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Вывод размера SafeSet после удаления элементов
        try {
            System.out.println("Размер SafeSet после удаления: " + safeSet.size());
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Пример использования SafeList
        SafeList<String> safeList = new SafeList<>();

        // Добавление элементов в SafeList из нескольких потоков
        Thread thread3 = new Thread(() -> {
            safeList.add("Один");
            safeList.add("Два");
        });

        Thread thread4 = new Thread(() -> {
            safeList.add("Три");
            safeList.add("Четыре");
        });

        thread3.start();
        thread4.start();

        // Ожидание завершения работы потоков
        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Вывод размера SafeList
        synchronized (safeList) {
            System.out.println("Размер SafeList: " + safeList.size());
        }

        // Проверка наличия элементов в SafeList
        synchronized (safeList) {
            System.out.println("SafeList содержит \"Один\"?: " + safeList.contains("Один"));
            System.out.println("SafeList contains \"Пять\"?: " + safeList.contains("Пять"));
        }

        // Удаление элементов из SafeList
        synchronized (safeList) {
            System.out.println("Удаление элемента \"Два\" from SafeList: " + safeList.remove("Два"));
            System.out.println("Удаление элемента \"Шесть\" from SafeList: " + safeList.remove("Шесть"));
        }

        // Вывод размера SafeList после удаления элементов
        synchronized (safeList) {
            System.out.println("Размер SafeList после удаления: " + safeList.size());
        }
    }
}