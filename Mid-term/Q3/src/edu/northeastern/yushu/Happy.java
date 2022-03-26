package edu.northeastern.yushu;

public class Happy extends Moody {

    public Happy(){}
    // returns string indicating happy
    @Override
    public String getMood(){
        return "happy";
    }
    //print laughter string “heeehee....hahahah...HAHAHA!!”
    @Override
    public void ExpressFeelings() {
        System.out.println("heeehee....hahahah…HAHAHA!!");
    }
    //returns message about self: “Subject laughs a lot”
    public String toString(){
        return "Subject laughs a lot";
    }
}
