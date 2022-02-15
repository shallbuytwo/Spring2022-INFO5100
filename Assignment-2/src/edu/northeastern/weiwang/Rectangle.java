package edu.northeastern.weiwang;

class Rectangle extends Shape {
    double length;
    double width;

    // The empty constructor doesn't make much sense. Omitting.

    public Rectangle(double length, double width) {
        super("Rectangle", "Color doesn't matter");
        this.length = length;
        this.width = width;
    }

    void computeArea() {
        super.setArea(length * width);
    }

    void computePerimeter() {
        super.setPerimeter(2 * length + 2 * width);
    }
}
