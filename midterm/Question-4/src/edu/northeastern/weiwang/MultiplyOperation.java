package edu.northeastern.weiwang;

public class MultiplyOperation implements MathOperation {
    public MultiplyOperation () {}
    @Override
    public int performOperation(int num1, int num2) {
        return num1 * num2;
    }
}
