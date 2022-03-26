package edu.northeastern.weiwang;

public class Psychiatrist {
    public Psychiatrist() {}
    public void examine(Moody moodyObject) {
        System.out.println(moodyObject.getMood());
        moodyObject.expressFeelings();
    }
    public void observe(Moody moodyObject) {
        System.out.println("Observation: " + moodyObject.toString());
    }
}
