package edu.northeastern.weiwang;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Rhombus extends Shape {
    double d1;
    double d2;

    public Rhombus(double d1, double d2) {
        super("Rhombus", "Color doesn't matter");
        this.d1 = d1;
        this.d2 = d2;
    }

    public Rhombus(double d) {
        super("Rhombus", "Color doesn't matter");
        this.d1 = d;
        this.d2 = d;
    }

    @Override
    public double getArea() {
        return d1 * d2 / 2;
    }

    @Override
    public double getPerimeter() {
        return sqrt(pow(d1 / 2, 2) + pow(d2 / 2, 2)) * 4;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }
}
