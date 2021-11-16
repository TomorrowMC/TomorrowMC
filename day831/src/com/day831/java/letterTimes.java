package com.day831.java;

/**
 * @author Yifei.Hu
 * @create 2021-09--18:20
 */
class Text3{
    public static  int letterTimes(String str1,String str2){
        int times = 0;
        int i =0;
        StringBuffer sb1 = new StringBuffer(str1);//把目标字符串改成Buffer
        while (true) {
            if (sb1.indexOf(str2,i)==-1) {
                break;
            }else{
                i = sb1.indexOf(str2,i)+str2.length();//保证下一次开始时从单词末尾开始
               times++;
            }//进行判断，如果目标字符串包含str2，就从单词末尾开始重置，计数器加一，直到从最后一个匹往后找不到为止
        }
        return  times;
    }
}
public class letterTimes {
    public static void main(String[] args) {
        System.out.println(Text3.letterTimes("ssdfghjklssss", "ss"));

    }
}
