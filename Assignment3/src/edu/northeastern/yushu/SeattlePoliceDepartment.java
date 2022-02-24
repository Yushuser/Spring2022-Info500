package edu.northeastern.yushu;

import java.util.ArrayList;

// Create a class called SeattlePoliceDepartment
public class SeattlePoliceDepartment extends Person {
    ArrayList<Person> person;
    String notification;
    public SeattlePoliceDepartment(String name, int age) {
        super(name, age);
        this.person = new ArrayList<>();
    }
    // Create a method called NotifyCitizens which will take a String as argument.
    public void NotifyCitizens(String notification) {
        this.notification = notification;
        for (Person person: person) {
            person.getNotification(this);
        }
    }
}
