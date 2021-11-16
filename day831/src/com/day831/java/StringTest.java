package com.day831.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;

/**
 * @author Yifei.Hu
 * @create 2021-08--14:04
 */
public class StringTest {

    @Test
    public void test() {
        String a = "abc";
        String b = a.replace('b', 'm');
        System.out.println(b);//输出amc
        System.out.println(a);//依然输出abc
    }


    @Test
    public void test1() {
        String x = "abc";
        System.out.println(x.length());
        System.out.println(x.charAt(1));
        System.out.println(x.isEmpty());
        System.out.println(x.toUpperCase(Locale.ROOT));
        System.out.println(x);
        String x1 = "abcdef";
        System.out.println(x1);
        System.out.println(x.concat(x1.trim()));
        System.out.println(x.substring(0, 3));
        System.out.println(x1.endsWith("bc"));
        System.out.println(x1.startsWith("b", 1));
        System.out.println(x1.contains("bc"));
        System.out.println(x1.indexOf("ef", 2));
        String x2 = "1234";
        int i1 = Integer.parseInt(x2);
        String x3 = String.valueOf(i1);
        char[] c1 = x2.toCharArray();
        System.out.println(c1);
        String x4 = new String(c1);
        System.out.println(x4);
    }

    @Test
    public void test2() throws UnsupportedEncodingException {
        String x2 = "1234中国";
        byte[] b1 = x2.getBytes("gbk");
        System.out.println(Arrays.toString(b1));
        //编码完成，输出[49, 50, 51, 52, -42, -48, -71, -6]
        String x3 = new String(b1);
        System.out.println(x3);
        //编码集不一样的话，可能会出现乱码：1234�й�
        String x4 = new String(b1,"gbk");
        System.out.println(x4);
        //修改了编码集就正常了：1234中国
    }
    @Test
    public void test3(){

    }
}
