package edu.northeastern.weiwang;

public class Main {

    public static void main(String[] args) {
        // One spd instance.
        SeattlePoliceDepartment spd = new SeattlePoliceDepartment();
        // Several people
        Person p1 = new Person("Alice", 20);
        Person p2 = new Person("Bob", 21);
        Person p3 = new Person("Charlie", 22);
        Person p4 = new Person("Doug", 23);
        // Subscribe to SPD.
        p1.subscribe(spd);
        p2.subscribe(spd);
        p3.subscribe(spd);
        p4.subscribe(spd);
        // Publish a message.
        spd.notifyCitizens("Hello world!");

        System.out.println("");

        // Unsubscribe two people from SPD.
        p2.unsubscribe(spd);
        p4.unsubscribe(spd);
        // Publish a message.
        spd.notifyCitizens("Hello world again!");
    }
}
