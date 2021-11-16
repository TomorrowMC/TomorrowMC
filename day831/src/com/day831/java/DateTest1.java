package com.day831.java;

import org.junit.Test;

import java.util.Date;

/**
 * @author Yifei.Hu
 * @create 2021-09--14:30
 */
public class DateTest1 {
    @Test
    public void test1() {
        Date d1 = new Date();
        System.out.println(d1.getTime());
        System.out.println(d1.toString());
    }
}
