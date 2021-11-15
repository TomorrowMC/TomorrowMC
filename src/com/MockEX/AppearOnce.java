package com.MockEX;/*
 * Mock Lab Test
 */

public class AppearOnce {

    // Mock Lab Test Question 5
    // Complete the method appearOnce that on input a non-empty string, 
    // prints the first character that appears exactly once in the string.
    // You may assume that the input string will contain at least one such character.
    // You must use String methods in lecture notes.
    // You must NOT use StringBuilder or Regular Expression methods.
    public static char appearOnce(String input) {
        char output = '0';
        for (int i = 0; i < input.length(); i++) {
            int repeatNumbers=0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == input.charAt(i)) {
                    repeatNumbers++;
                }
            }
            if (repeatNumbers == 1) {
                output= input.charAt(i);
                break;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String input = "abcdbaddab";
        System.out.println(appearOnce(input)); // 'c'
        input = "abcdcb";
        System.out.println(appearOnce(input)); // 'a'
        input = "x";
        System.out.println(appearOnce(input)); // 'x'

        // add your own test cases


    }
}
