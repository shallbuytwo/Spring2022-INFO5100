package edu.northeastern.weiwang;

public class SubtractOperation implements MathOperation {
    public SubtractOperation () {}
    @Override
    public int performOperation(int num1, int num2) {
        return num1 - num2;
    }
}
