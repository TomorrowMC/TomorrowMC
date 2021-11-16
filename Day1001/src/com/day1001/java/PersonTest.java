package com.day1001.java;

import org.junit.Test;

/**
 * @author Yifei.Hu
 * @create 2021-10--15:52
 */
public class PersonTest {
    @Test
    public void test1() throws NoSuchMethodException, ClassNotFoundException {
Class clazz = Class.forName("src.com.day1001.java.Person");
        System.out.println(clazz);
    }
}
