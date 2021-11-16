package com.day920.java;

import java.io.File;

/**
 * @author Yifei.Hu
 * @create 2021-09--20:29
 */
public class fileName {
    static int x;
    public static void main(String[] args) {
        File file = new File("/Users/yifei.hu/NoUpdate/Java/HighSenior");
        fileName.getfile(file,fileName.x);
        System.out.println(fileName.x);
    }
    public static void getfile(File file,int x){
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1:
                 files) {
                getfile(file1,fileName.x);
            }
        }else{
            fileName.x+= file.length();
        }
    }
}
