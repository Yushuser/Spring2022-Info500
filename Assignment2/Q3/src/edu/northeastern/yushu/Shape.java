package edu.northeastern.yushu;

public class Shape {
    private String name;
    private double perimeter;
    private double area;
    public Shape() {
    }
    public String getName() {
        return name;
    }
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void display() {
        System.out.println("=========================================");
        System.out.println("The Shape: " + getName());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }
}
