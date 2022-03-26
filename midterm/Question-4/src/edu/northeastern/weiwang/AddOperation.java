package edu.northeastern.weiwang;

public class AddOperation implements MathOperation {
    public AddOperation() {}
    @Override
    public int performOperation(int num1, int num2) {
        return num1 + num2;
    }
}
