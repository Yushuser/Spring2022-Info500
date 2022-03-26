package edu.northeastern.yushu;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Serena", 4);
        // Call the copy
        Student student2 = new Student(student1);
        Student student3 = student1;
        student2.setId(2);
        student3.setId(3);
        student1.printStudent();
        student2.printStudent();
        student3.printStudent();
    }
}
    // Question 1: Deep copy shallow copy
    class Student {
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
