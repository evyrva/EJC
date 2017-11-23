package com.epam.javalab.codingbat.string_3.notReplace;

public class NotReplace {
    /**
     * Given a string, return a string where every appearance of the lowercase word "is" has been replaced with
     * "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the
     * "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

     notReplace("is test") → "is not test"
     notReplace("is-is") → "is not-is not"
     notReplace("This is right") → "This is not right"
     */

    public static void main(String[] args){
        System.out.println(notReplace("day fyyyz"));
    }

    public static String notReplace(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == 'i' && str.charAt(i+1) == 's' &&
                    (i==0 || !Character.isLetter(str.charAt(i-1)))&&
                    (i==str.length()-2 || !Character.isLetter(str.charAt(i+2)))){
                stringBuilder.append("is not");
                i++;
            }else if (i==str.length()-2) stringBuilder.append(str.substring(i));
            else stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

}
