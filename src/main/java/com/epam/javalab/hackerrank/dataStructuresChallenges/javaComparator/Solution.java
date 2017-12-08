package com.epam.javalab.hackerrank.dataStructuresChallenges.javaComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 == null || o2 == null) throw new NullPointerException();
        if (o1 instanceof Player && o2 instanceof Player){
            if (((Player) o1).score - ((Player) o2).score != 0)
                return ((Player) o2).score - ((Player) o1).score;
            else{
                return ((Player) o1).name.compareTo(((Player) o2).name);
            }
        }else throw new ClassCastException();
    }
}

class Player{
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
