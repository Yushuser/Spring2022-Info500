package edu.northeastern.yushu;

public class Psychiatrist {
    // asks moody object about its mood
    public void examine(Moody moody){
        System.out.println("How are you feeling today");
        moody.getMood();
    }
    //a moodyObject is observed to either laugh or cry
    public void observe(Moody moody){
        moody.ExpressFeelings();
        System.out.println("Observation:" + moody.toString());
    }
    //returns message about self: “Subject laughs a lot”
    public String toString(){
        return null;
    }
    public String getMood(){
        return null;
    }

    public void ExpressFeeling(){}
}