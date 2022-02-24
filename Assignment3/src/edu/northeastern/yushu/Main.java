package edu.northeastern.yushu;
/*1. Create a class called SeattlePoliceDepartment
2. Create a method called NotifyCitizens which will take a String as argument. This string will be any public notification they want all the citizens to know about
3. Create a class called Person, which will have Name and age as properties. also create subscribe and unsubscribe functions which will take SeattlePoliceDepartment as argument. Create a method getNotification which will take SeattlePoliceDepartment as argument
4. In the main function create one instance of SeattlePoliceDepartment This will be publisher
5. Create 3-4 instances of person.
6. Subscribe some persons to SeattlePoliceDepartment
7. Publish a message from SeattlePoliceDepartment
8. Unsubscribe 1 or 2 users from SeattlePoliceDepartment
10. Publish the message again. */
public class Main {

    public static void main(String[] args) {
        // Create 3-4 instances of person.
        Person p1 = new Person("Peter", 21);
        Person p2 = new Person("Sana", 22);
        Person p3 = new Person("Gigi",23);
        Person p4 = new Person("Blake",24);
        // Create one instance of SeattlePoliceDepartment
        SeattlePoliceDepartment s1 = new SeattlePoliceDepartment("Publisher", 45);
        // Subscribe some persons to SeattlePoliceDepartment
        p1.subscribe(s1);
        p2.subscribe(s1);
        p3.subscribe(s1);
        p4.subscribe(s1);
        // Publish a message from SeattlePoliceDepartment
        System.out.println("Message 1 : ");
        s1.NotifyCitizens(" Attention! ");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Unsubscribe 1 or 2 users from SeattlePoliceDepartment
        p1.unsubscribe(s1);
        p2.unsubscribe(s1);
        //  Publish the message again
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Message 2 : ");
        s1.NotifyCitizens(" This is Seattle Police Department ! ");

    }
}
