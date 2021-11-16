package com.day909.java;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author Yifei.Hu
 * @create 2021-09--16:16
 */
public class Maptest {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(new Scanner(System.in).nextInt());
        al1.add(new Scanner(System.in).nextInt());
        al1.add(new Scanner(System.in).nextInt());
        al1.add(new Scanner(System.in).nextInt());
        al1.add(new Scanner(System.in).nextInt());
        al1.add(new Scanner(System.in).nextInt());
        al1.add(new Scanner(System.in).nextInt());
        al1.add(new Scanner(System.in).nextInt());
        al1.add(new Scanner(System.in).nextInt());
        al1.add(new Scanner(System.in).nextInt());
        Collections.sort(al1, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                int i1=(int) o1;
                int i2=(int) o2;
                return -Integer.compare(i1,i2);
            }
        });
ArrayList al2= (ArrayList) Collections.synchronizedList(al1);
        System.out.println(al1);
    }

    @Test
    public void test1(){
        File file1=new File("/Users/yifei.hu/Downloads/lhd/GRA5.py");
        System.out.println(file1.exists());
        String absolutePath = file1.getParent();
        File file = new File(absolutePath,"txt.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
