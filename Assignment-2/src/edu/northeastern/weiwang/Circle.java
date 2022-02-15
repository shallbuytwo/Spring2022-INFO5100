package edu.northeastern.weiwang;

class Circle extends Shape {
    double radius;

    // The empty constructor doesn't make much sense. Omitting.

    public Circle(double radius) {
        super("Circle", "Color doesn't matter");
        this.radius = radius;
    }

    public void computeArea() {
        super.setArea(3.14 * radius * radius);
    }

    public void computePerimeter() {
        super.setPerimeter(2 * 3.14 * radius);
    }
}
