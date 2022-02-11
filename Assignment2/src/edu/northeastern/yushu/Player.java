package edu.northeastern.yushu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/*
Question 4: Comparators are used to compare two objects. You'll create a
comparator and use it to sort an array. You must create Player class. It has 2 fields:
a String name and a score integer. Given an array of Player objects, write a
comparator that sorts them in order of decreasing score; if 2 or more players have
the same score, sort those players alphabetically by name.
write an int compare (Player a, Player b) method implementing the Comparator.
compare (T o1, T o2) method.
 */

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a1, Player a2) {
        if (a1.score < a2.score) {
            return 1;
        } else if (a1.score > a2.score) {
            return -1;
        } else {
            return a1.name.compareTo(a2.name);
        }
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Player[] player = new Player[n];
        Checker checker = new Checker();
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
