package edu.northeastern.weiwang;

public abstract class Moody {
    public Moody() {}
    public abstract String getMood();
    public abstract void expressFeelings();
    public void queryMood() {
        System.out.println(getMood());
    }
}
