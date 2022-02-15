package edu.northeastern.weiwang;

class Shape {
    String name;
    String color;
    // These two variables will not be maintained in Question 2.
    // But they will be maintained in Question 3.
    double area = 0;
    double perimeter = 0;

    // The following constructors and methods are for Question 2.
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, double area, double perimeter) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String printShape() {
        return name + " " + color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    // The following constructors and methods are for Question 3.

    // The empty constructor doesn't make much sense. Omitting.

    public void display() {
        System.out.println(name + " " + color + " Area: " + area + " Perimeter: " + perimeter);
    }
}
