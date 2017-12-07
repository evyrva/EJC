package com.epam.javalab.hackerrank.dataStructuresChallenges.javaStack;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code

            System.out.println(checkBalance(input));
        }
    }

    static boolean checkBalance(String input) {
        List<String> closingParanList = Arrays.asList("(", "[", "{");
        List<String> openingParanList = Arrays.asList(")", "]", "}");
        Stack<String> stack = new Stack<>();
        if (input.length() == 0) return true;
        for (int i = 0; i < input.length(); i++) {
            String paran = input.substring(i, i + 1);
            if (stack.empty() && closingParanList.contains(paran)) return false;
            if (!stack.empty() && openingParanList.contains(stack.peek())
                    && closingParanList.contains(paran)) {
                if (stack.peek().equals("(") && paran.equals(")") ||
                        stack.peek().equals("[") && paran.equals("]") ||
                        stack.peek().equals("{") && paran.equals("}")){
                    stack.pop();
                    break;
                } else return false;
            }
            stack.push(paran);
        }
        return stack.empty();
    }
}