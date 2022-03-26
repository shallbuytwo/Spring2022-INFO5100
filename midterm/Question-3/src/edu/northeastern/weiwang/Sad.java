package edu.northeastern.weiwang;

public class Sad extends Moody {
    public Sad() {
        super();
    }
    @Override
    public String getMood() {
        return "I feel sad today";
    }
    @Override
    public void expressFeelings() {
        System.out.println("'waah' 'boo hoo' 'weep' 'sob'");
    }
    public String toString() {
        return "Subject cries a lot";
    }
}
