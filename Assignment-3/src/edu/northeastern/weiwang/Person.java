package edu.northeastern.weiwang;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void subscribe(SeattlePoliceDepartment spd) {
        spd.addPerson(this);
    }

    void unsubscribe(SeattlePoliceDepartment spd) {
        spd.removePerson(this);
    }

    void getNotification(SeattlePoliceDepartment spd) {
        String msg = spd.getCurrentMessage();
        System.out.println(name + " received the message: " + msg);
    }
}
