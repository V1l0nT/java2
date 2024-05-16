package src.lab3;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class SafeSet<T> {
    private final Set<T> set = new HashSet<>();
    private final Semaphore semaphore = new Semaphore(1);

    public void add(T element) throws InterruptedException {
        semaphore.acquire();
        try {
            set.add(element);
        } finally {
            semaphore.release();
        }
    }

    public boolean contains(T element) throws InterruptedException {
        semaphore.acquire();
        try {
            return set.contains(element);
        } finally {
            semaphore.release();
        }
    }

    public boolean remove(T element) throws InterruptedException {
        semaphore.acquire();
        try {
            return set.remove(element);
        } finally {
            semaphore.release();
        }
    }

    public int size() throws InterruptedException {
        semaphore.acquire();
        try {
            return set.size();
        } finally {
            semaphore.release();
        }
    }
}