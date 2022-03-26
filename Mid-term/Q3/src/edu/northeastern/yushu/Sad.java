package edu.northeastern.yushu;

public class Sad extends Moody{
    public Sad(){}
    //returns string indicating sad
    @Override
    public String getMood(){
        return "sad";
    }
    //print crying string “‘waah’ ‘boo hoo’ ‘weep’ ‘sob’”
    @Override
    public void ExpressFeelings() {
        System.out.println("'waah' 'boo hoo' 'weep' 'sob'");
    }
    //returns message about self : “Subject cries a lot”
    public String toString(){
        return "Subject cries a lot";
    }

    public void queryMood(){
        System.out.println("I feel sad today");
    }
}