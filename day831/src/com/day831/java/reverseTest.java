package com.day831.java;

/**
 * @author Yifei.Hu
 * @create 2021-09--17:25
 */

class Text1 {
    public static StringBuffer reserve(String str1, int i, int j) {
        StringBuffer sb1 = new StringBuffer(str1);//把string变成Buffer
        String str2 = sb1.substring(i,j+1);//提取需要反转的
        StringBuffer sb2 = new StringBuffer(str2);//把需要反转的转化成Buffer
        sb2.reverse();
        str2=sb2.toString();//把Buffer转化成string
        sb1.replace(i,j+1,str2);//替换
        return sb1;
    }
}

public class reverseTest {
    public static void main(String[] args) {
        String str1="123456789";
        System.out.println(Text1.reserve(str1, 0, 2));
    }


}
