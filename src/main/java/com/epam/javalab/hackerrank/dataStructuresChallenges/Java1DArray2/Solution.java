package com.epam.javalab.hackerrank.dataStructuresChallenges.Java1DArray2;

import java.util.*;

public class Solution {
    public static boolean[] isVisited;
    public static int[] game;
    public static boolean canWin(int leap) {
        // Return true if you can win the game; otherwise, return false.
        return plaingGame(leap, 0);
    }

    public static boolean plaingGame(int leap, int place){
        int n = 0;
//        System.out.println(n++);// 0
        if (place == game.length-1 || place+leap >= game.length) return true;
//        System.out.println(n++);// 1
        if (isVisited[place]) return false;
        isVisited[place] = true;
        if (isValidPlace(place+1) && plaingGame(leap, place+1)) return true;
//        System.out.println(n++);// 2
        if (isValidPlace(place-1) && plaingGame(leap, place-1)) return true;
//       System.out.println(n++);// 3
        if (isValidPlace(place+leap) && plaingGame(leap, place+leap)) return true;
//        System.out.println(n++);// 4
        isVisited[place] = false;
        return false;
    }

    static boolean isValidPlace(int place){
        return place >= 0 && place < game.length && game[place] == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int count = 1;
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            game = new int[n];
            isVisited = new boolean[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
//            System.out.println(count++);
            System.out.println( (canWin(leap)) ? "YES" : "NO" );
        }
        scan.close();
    }
}