package edu.northeastern.weiwang;

import java.util.LinkedList;

public class ThreadSafeQueue<T> {
    private LinkedList<T> queue;
    ThreadSafeQueue() {
        queue = new LinkedList<T>();
    }
    void add(T data) {
        synchronized (queue) {
            queue.add(data);
        }
    }
    T remove() {
        synchronized (queue) {
            return queue.remove();
        }
    }
    T peek() {
        synchronized (queue) {
            return queue.peek();
        }
    }
    boolean isEmpty() {
        synchronized (queue) {
            return queue.peek() == null;
        }
    }
}
