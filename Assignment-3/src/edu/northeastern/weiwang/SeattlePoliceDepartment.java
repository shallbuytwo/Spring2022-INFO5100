package edu.northeastern.weiwang;

import java.util.ArrayList;

class SeattlePoliceDepartment {
    ArrayList<Person> people;
    String currentMessage;

    public SeattlePoliceDepartment() {
        people = new ArrayList<Person>();
    }

    public void addPerson(Person p) {
        if (!people.contains(p)) {
            people.add(p);
        }
    }

    public void removePerson(Person p) {
        people.remove(p);
    }

    public String getCurrentMessage() {
        return currentMessage;
    }

    public void notifyCitizens(String msg) {
        currentMessage = msg;
        System.out.println("SeattlePoliceDepartment broadcast message: " + currentMessage);
        for (Person p : people) {
            p.getNotification(this);
        }
    }
}
