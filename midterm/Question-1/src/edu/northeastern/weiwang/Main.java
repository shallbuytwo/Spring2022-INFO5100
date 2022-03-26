package edu.northeastern.weiwang;

public class Main {
    public static void main(String[] args) {
        // Shallow copy
        Student s1 = new Student("Alice", 123, 4.0);
        Student s2 = s1;
        System.out.println(s1.getGpa());
        s2.setGpa(3.9);
        System.out.println(s1.getGpa());
        // Deep copy
        s1 = new Student("Alice", 123, 4.0);
        Student s3 = new Student(s1);
        System.out.println(s1.getGpa());
        s3.setGpa(3.9);
        System.out.println(s1.getGpa());
    }
}
