package edu.northeastern.yushu;

import java.io.File;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // Question 1
        Student student1 = new Student(1, "Serena", 4);
        // Call the copy
        Student student2 = new Student(student1);
        Student student3 = student1;
        student2.setId(2);
        student3.setId(3);
        student1.printStudent();
        student2.printStudent();
        student3.printStudent();
        /* Question 2 Write difference between abstract class and interface.
        Interface:
        The interface is a blueprint that can be used to implement a class.
        The interface does not contain any concrete methods (methods that have code).
        All the methods of an interface are abstract methods.
        An interface cannot be instantiated.
        However, classes that implement interfaces can be instantiated.
        Interfaces never contain instance variables but, they can contain public static final variables (i.e., constant class variables)
        Abstract class:
        A class which has the abstract keyword in its declaration is called abstract class.
        Abstract classes should have at least one abstract method. , i.e., methods without a body.
        It can have multiple concrete methods.
        Abstract classes allow you to create blueprints for concrete classes.
        But the inheriting class should implement the abstract method.Abstract classes cannot be instantiated.
        Difference:
        An abstract class permits you to make functionality that subclasses can implement or override whereas an interface only permits you to state functionality but not to implement it.
        A class can extend only one abstract class while a class can implement multiple interfaces.
        */
        // Question 3 Write java program
        // Question 5
        Camera cam1 = Camera.getInstance();
        // Question 6
        String s = "abcabcbb";
        System.out.println(Question6(s));
    }
    // Question 1: Deep copy shallow copy
    public static class Student {
        int id;
        String name;
        float gpa;
        // Constructor
        public Student(int id, String name, float gpa) {
            this.id = id;
            this.name = name;
            this.gpa = gpa;
        }
        // Copy Constructor
        public Student(Student student) {
            this.id = student.id;
            this.name = student.name;
            this.gpa = student.gpa;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getGpa() {
            return gpa;
        }

        public void setGpa(float gpa) {
            this.gpa = gpa;
        }
        public void printStudent(){
            System.out.println("========================");
            System.out.println("Name : " + this.name);
            System.out.println("ID : " + this.id);
            System.out.println("GPA : " + this.gpa);
        }
    }
    // Question 5:  Singleton
    public static class Camera {

        private Camera() {}
        public String getCameraName() {
            return cameraName;
        }
        public void setCameraName(String cameraName) {
            this.cameraName = cameraName;
        }
        private static  Camera _instance;
        private static Object obj = new Object();
        private String cameraName = "";
        public static Camera getInstance() {
            if(_instance == null) {
                synchronized (obj) {
                    if(_instance == null) {
                        _instance = new Camera();
                    }
                }
            }
            return _instance;
        }
    }
    // Question 6
    public static int Question6(String s) {
        if (s.length() == 0) {
            return 0;
        }
        // Use HashMap to keep char and its index map
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0; // the longest substring
        int left = 0; // pointer
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            // update
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
