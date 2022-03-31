package edu.northeastern.weiwang;

public class ThreadClass implements Runnable {
    String name;
    ThreadSafeQueue<String> q;
    public ThreadClass(String name, ThreadSafeQueue<String> q) {
        this.name = name;
        this.q = q;
    }

    @Override
    public void run() {
        while (true) {
            // push an element
            q.add("aaa");
            System.out.println("Thread " + name + " pushed an element to the queue.");

            // sleep
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // do nothing
            }

            // remove an element
            q.remove();
            System.out.println("Thread " + name + " popped an element out of the queue.");

            // sleep
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // do nothing
            }
        }
    }
}
