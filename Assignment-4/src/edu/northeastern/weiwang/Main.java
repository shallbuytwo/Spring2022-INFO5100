package edu.northeastern.weiwang;

public class Main {
    public static void main(String[] args) {
        ThreadSafeQueue<String> q1 = new ThreadSafeQueue<String>();
        q1.add("aaa");
        q1.add("bbb");
        q1.add("ccc");
        System.out.println(q1.peek());
        q1.remove();
        System.out.println(q1.peek());
        System.out.println(q1.isEmpty());
    }
}
