package com.epam.javalab.hackerrank.bigNumber.javaBigDemical;

import java.math.BigDecimal;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        int j;
        boolean flag = true;   // устанавливаем наш флаг в true для первого прохода по массиву
        String temp;   // вспомогательная переменная

        while (flag) {
            flag = false;    // устанавливаем флаг в false в ожидании возможного свопа (замены местами)
            for (j = 0; j < s.length - 1; j++) {
                if ((new BigDecimal(s[j])).compareTo(new BigDecimal(s[j+1])) < 0) { // измените на > для сортировки по возрастанию
                    temp = s[j];         // меняем элементы местами
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                    flag = true;  // true означает, что замена местами была проведена
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }


}
