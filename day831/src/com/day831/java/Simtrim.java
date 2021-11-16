package com.day831.java;

/**
 * @author Yifei.Hu
 * @create 2021-09--10:50
 */

class Text {

    public static StringBuffer trim(String s1) {
        StringBuffer sb1 = new StringBuffer(s1);//新建一个Buffer，把String传入
        removeNull(sb1);//正方向消除空格
        sb1 = sb1.reverse();//翻个方向
        removeNull(sb1);//消除空格
        sb1 = sb1.reverse();//反转回来
        return sb1;
    }


    private static void removeNull(StringBuffer sb1) {
//创建一个临时的String，为空格，然后比较然后重复此操作，直到差值是正常
        StringBuffer sb2 = new StringBuffer(" ");//创建一个空的作比较用
        while (true) {
            if (sb2.charAt(0) == sb1.charAt(0)) {
                sb1.delete(0, 1);
            } else {
                break;//直到出现非空格，该方法break
            }
        }
    }

    public static StringBuffer trim2(String s1) {
        StringBuffer sb1 = new StringBuffer(s1);//新建一个Buffer，把String传入
        sb1 = removeNull2(sb1);//正方向消除空格
        sb1 = sb1.reverse();//翻个方向
        sb1 = removeNull2(sb1);//消除空格
        sb1 = sb1.reverse();//反转回来
        return sb1;
    }

    public static StringBuffer removeNull2(StringBuffer sb1) {
        String s1 = new String(sb1);
        while (true) {
            if (s1.startsWith(" ")) {
                s1 = s1.substring(1, s1.length());
            } else {
                sb1 = new StringBuffer(s1);
                return sb1;
            }
        }

    }

}

public class Simtrim {
    public static void main(String[] args) {
        String str1 = "     dsafsadf     ";
        System.out.println(Text.trim(str1));
        System.out.println(Text.trim2(str1));
    }
}
