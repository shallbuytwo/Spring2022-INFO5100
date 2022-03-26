package edu.northeastern.weiwang;

public class Student {
    private String name;
    private int studentID;
    private double gpa;
    public Student(String name, int studentID, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;
    }
    public Student(Student otherStudent) {
        name = otherStudent.getName();
        studentID = otherStudent.getStudentID();
        gpa = otherStudent.getGpa();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
