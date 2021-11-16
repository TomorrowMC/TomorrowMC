package com.day831.java;

/**
 * @author Yifei.Hu
 * @create 2021-09--22:39
 */
class Text4 {
    public Text4() {
    }


    public static String getMaxSub(String str, String substr) {

        for (int i = substr.length(); i >=2; i--) {
            for (int j = 0; j < i; j++) {
                String substr1 = substr.substring(j, i);
                if (str.contains(substr1)) {
                    return substr1;
                }
            }
        }
        return "没有找到子串";
    }
}


public class MaxSubstring {
    public static void main(String[] args) {
        System.out.println(Text4.getMaxSub("asdfghjkl", "jqweewrewrqer"));
    }
}
