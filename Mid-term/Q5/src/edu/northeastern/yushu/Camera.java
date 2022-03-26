package edu.northeastern.yushu;

public class Camera {

    private static Camera _instance;
    private static Object obj = new Object();
    private String CameraName;

    private Camera () {
    }

    public Camera get_instance() {
        if (_instance == null) {
            synchronized (obj) {
                if (_instance == null) {
                    _instance = new Camera();
                }
            }
        }
        return _instance;
    }

    public String getCameraName() {
        return this.CameraName;
    }

    public void setCameraName(String name) {
        this.CameraName = name;
    }
}
