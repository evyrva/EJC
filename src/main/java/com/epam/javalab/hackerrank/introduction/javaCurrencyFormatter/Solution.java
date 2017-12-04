package com.epam.javalab.hackerrank.introduction.javaCurrencyFormatter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) throws IOException {
/*        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double payment = Double.valueOf(reader.readLine());
        reader.close();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}

