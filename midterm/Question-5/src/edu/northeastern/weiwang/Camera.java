package edu.northeastern.weiwang;

public class Camera {
    private Camera() {}
    private static Camera instance;
    private String cameraName = "";
    private static Object obj = new Object();

    public static Camera getInstance() {
        if (instance == null) {
            synchronized (obj) {
                if (instance == null) {
                    instance = new Camera();
                }
            }
        }
        return instance;
    }

    public void setCameraName(String n) {
        cameraName = n;
    }
    public String getCameraName() {
        return cameraName;
    }
}
