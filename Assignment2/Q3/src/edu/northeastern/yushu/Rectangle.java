package edu.northeastern.yushu;

public class Rectangle extends Shape {
    private  double width;
    private  double length;

    public Rectangle() {
        super();
    }
    public Rectangle(double width, double length) {
        super();
        this.width=width;
        this.length=length;
    }
    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }
    @Override
    public double getArea() {
        return length * width;
    }

    public void computePerimeter() {
        System.out.println("=========================================");
        System.out.println("Perimeter: " + getPerimeter());
    }

    public void computeArea() {
        System.out.println("=========================================");
        System.out.println("Area: " + getArea());
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
}
