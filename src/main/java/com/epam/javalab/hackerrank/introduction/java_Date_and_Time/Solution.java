package com.epam.javalab.hackerrank.introduction.java_Date_and_Time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {
    public static String getDay(String day, String month, String year) {
        /*
        * Write your code here.
        */
        String dayOfWeek = "";
        Calendar calendar = new GregorianCalendar(Integer.valueOf(year), Integer.valueOf(month)-1, Integer.valueOf(day));
        Date date = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("E");
        System.out.println(format.format(date));
        System.out.println(date.toString());
        switch (format.format(date)){
            case "01" : {
                dayOfWeek = "MONSDAY".toUpperCase();
                break;
            }case "02" : {
                dayOfWeek = "Tuesday".toUpperCase();
                break;
            }case "03" : {
                dayOfWeek = "Wednesday".toUpperCase();
                break;
            }case "04" : {
                dayOfWeek = "Thursday".toUpperCase();
                break;
            }case "05" : {
                dayOfWeek = "Friday".toUpperCase();
                break;
            }case "06" :{
                dayOfWeek = "Saturday".toUpperCase();
                break;
            }case "07" : {
                dayOfWeek = "Sunday".toUpperCase();
                break;
            }
        }
        return dayOfWeek;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}
