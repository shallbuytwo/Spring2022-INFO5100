package edu.northeastern.weiwang;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double calculateVolume() {
        return width * height * depth;
    }
}
