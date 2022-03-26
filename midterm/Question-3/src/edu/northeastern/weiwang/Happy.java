package edu.northeastern.weiwang;

public class Happy extends Moody {
    public Happy() {
        super();
    }
    @Override
    public String getMood() {
        return "I feel happy today";
    }
    @Override
    public void expressFeelings() {
        System.out.println("heeehee....hahah....HAHAHA!!");
    }
    public String toString() {
        return "Subject laughs a lot";
    }
}
