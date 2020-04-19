import java.util.*;

public class Queue<T> {
    List<T> queue;

    public Queue() {
        // инициализация внутреннего хранилища очереди
        queue = new ArrayList<>();
    }

    public void enqueue(T item) {
        // вставка в хвост
        queue.add(item);
    }

    public T dequeue() {
        // выдача из головы
        if (queue.isEmpty()) return null; // null если очередь пустая
        T el = queue.get(0);
        queue.remove(0);
        return el;
    }

    public int size() {
        return queue.size();
    }

}