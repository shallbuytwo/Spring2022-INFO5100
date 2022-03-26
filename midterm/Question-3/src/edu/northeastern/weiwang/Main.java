package edu.northeastern.weiwang;

public class Main {
    public static void main(String[] args) {
        Psychiatrist p = new Psychiatrist();
        System.out.println("How are you feeling today?");
        Moody m1 = new Happy();
        p.examine(m1);
        p.observe(m1);
        System.out.println("How are you feeling today?");
        Moody m2 = new Sad();
        p.examine(m2);
        p.observe(m2);
    }
}
