package edu.northeastern.weiwang;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


class Triangle extends Shape {
    double base = -1;
    double height = -1;
    // A special case, if the triangle has the same three sides, only side will
    // be set.
    double side = -1;

    public Triangle(double base, double height) {
        super("Triangle", "Color doesn't matter");
        this.base = base;
        this.height = height;
        // We will leave area and perimeter in the baseclass unset, since we
        // will override these two getters here.
    }

    public Triangle(double side) {
        super("Triangle", "Color doesn't matter");
        this.side = side;
    }

    @Override
    public double getArea() {
        if (side == -1) {
            return base * height / 2;
        }
        // For a triangle with the same three sides, the area will be...
        // 1/2 a * b * sinC
        return side * side * sqrt(3) / 4;
    }

    @Override
    public double getPerimeter() {
        if (side == -1) {
            return sqrt(pow(height, 2) + pow(base / 2, 2)) * 2 + base;
        }
        return 3 * side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
