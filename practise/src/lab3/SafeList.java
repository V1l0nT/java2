package src.lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class SafeList<T> implements Iterable<T> {
    private final List<T> list = new ArrayList<>();

    public synchronized void add(T element) {
        list.add(element);
    }

    public synchronized boolean contains(T element) {
        return list.contains(element);
    }

    public synchronized boolean remove(T element) {
        return list.remove(element);
    }

    public synchronized int size() {
        return list.size();
    }

    public synchronized T get(int index) {
        return list.get(index);
    }

    @Override
    public synchronized Iterator<T> iterator() {
        return list.iterator();
    }
}
