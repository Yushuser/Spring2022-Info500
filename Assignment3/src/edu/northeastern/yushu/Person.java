package edu.northeastern.yushu;
// Create a class called Person, which will have names and age as properties.
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // Create subscribe and unsubscribe functions which will take SeattlePoliceDepartment as argument.
    public void subscribe(SeattlePoliceDepartment s1) {
        if (!s1.person.contains(this)) {
            s1.person.add(this);
        }
    }
    public void unsubscribe(SeattlePoliceDepartment s1) {
        s1.person.remove(this);
    }
    // Create a method getNotification which will take SeattlePoliceDepartment as argument
    public void getNotification(SeattlePoliceDepartment s1) {
        System.out.println("Seattle Police Department : " + s1.getName());
        System.out.println("Person : " + this.getName() + "  " + getAge());
        System.out.println("Notification : " + s1.notification);
        System.out.println("====================================================");
    }
}
