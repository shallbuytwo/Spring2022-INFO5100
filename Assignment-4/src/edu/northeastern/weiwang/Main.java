package edu.northeastern.weiwang;

public class Main {
    public static void main(String[] args) {
        ThreadSafeQueue<String> q = new ThreadSafeQueue<String>();
        Thread t1 = new Thread(new ThreadClass("Alice", q));
        Thread t2 = new Thread(new ThreadClass("Bob", q));
        t1.start();
        t2.start();
    }
}
