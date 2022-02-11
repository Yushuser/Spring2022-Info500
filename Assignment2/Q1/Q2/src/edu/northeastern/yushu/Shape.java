package edu.northeastern.yushu;

public class Shape {
    //Class: Shape
    //Fields: name, color, area, perimeter
    private String name;
    private  String color;
    private  int area;
    private  int perimeter;
    //Constructors
    //Shape (name, color)
    //Shape (name, color, perimeter, area)
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public Shape(String name, String color, int perimeter, int area) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }
    public Shape() {
    }
    //Methods:
    //printShape()
    //getArea()
    //getPerimeter()
    public int getArea() {
        return area;
    }
    public int getPerimeter() {
        return perimeter;
    }
    //2) Create printShape() method in Shape class that returns desired string output.
    public void printShape() {
        System.out.println("The " + getName() + " is " + getColor());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(int area) {
        this.area = area;
    }
    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
}
