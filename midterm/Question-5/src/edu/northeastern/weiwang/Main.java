package edu.northeastern.weiwang;

public class Main {
    public static void main(String[] args) {
        Camera c1 = Camera.getInstance();
        c1.setCameraName("test_camera");
        Camera c2 = Camera.getInstance();
        System.out.println(c2.getCameraName());
    }
}
