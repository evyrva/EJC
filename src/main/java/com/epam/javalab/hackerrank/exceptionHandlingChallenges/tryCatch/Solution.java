package com.epam.javalab.hackerrank.exceptionHandlingChallenges.tryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.valueOf(reader.readLine());
            int b = Integer.valueOf(reader.readLine());
            System.out.println(a/b);
        } catch (IOException e){
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("java.util.InputMismatchException");
        }catch (ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
