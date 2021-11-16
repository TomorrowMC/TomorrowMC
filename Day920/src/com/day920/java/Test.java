package com.day920.java;

import java.io.File;

/**
 * @author Yifei.Hu
 * @create 2021-09--12:21
 */
public class Test {
    public static void main(String[] args) {
//        File file = new File("/Users/yifei.hu/NoUpdate/Java/HighSenior/src");
//        File file1 = new File(file, "good.txt");
//        File file3 = new File(file, "good1.txt");
//
//        try {
//            file1.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }     try {
//            System.out.println(file3.createNewFile());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        File file2 = new File(file, "/good/java");
//        file2.mkdirs();
//        file1.delete();
//        file2.delete();
//        file3.delete();
        File file = new File("/Users/yifei.hu/NoUpdate/Java/HighSenior/src/com");
        StringBuffer stringBuffer = new StringBuffer();
        for (String s: file.list()
             ) {
            stringBuffer.append(s);
        }

    }

}
