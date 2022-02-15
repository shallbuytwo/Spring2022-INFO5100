package edu.northeastern.weiwang;

class Student {
    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(Student otherStudent) {
        this.rollNumber = otherStudent.rollNumber;
        this.name = otherStudent.name;
    }

    public int printRoll() {
        return rollNumber;
    }

    public String printName() {
        return name;
    }
}
