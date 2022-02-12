package edu.northeastern.yushu;
import java.util.Arrays;
import java.util.Comparator;
//Question4: write a comparator that sorts them in order of decreasing score; if 2 or more players have the same score, sort those players alphabetically by name.
//write an int compare (Player a, Player b) method implementing the Comparator.compare (T o1, T o2) method.
public class Main {
    private static void printS(Player[] ps){
        for (int i = 0; i < ps.length;i++) {
            System.out.println(ps[i].getName() + " : " + ps[i].getScore());
        }
    }
    public static void main(String[] args) {
        Player p1 = new Player("Sarah", 11);
        Player p2 = new Player("Phoebe", 31);
        Player p3 = new Player("Peter", 15);
        Player p4 = new Player("Aria", 23);
        Player p5 = new Player("Hank", 11);
        Player[] ps = {p1, p2, p3, p4, p5};
        System.out.println("======== The Original ========");
        printS(ps);
        Comparator<Player> checkScore = (a1, a2) -> {
            if (a1.getScore() < a2.getScore()) {
                return 1;
            } else if (a1.getScore() > a2.getScore()) {
                return -1;
            } else {
                return a1.getName().compareTo(a2.getName());
            }
        };
        Arrays.sort(ps, checkScore);
        System.out.println("======== After comparing ========");
        printS(ps);
    }
}
