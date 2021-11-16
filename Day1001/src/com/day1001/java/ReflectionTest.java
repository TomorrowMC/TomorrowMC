package com.day1001.java;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @author Yifei.Hu
 * @create 2021-10--16:01
 */
public class ReflectionTest {
    @Test
    public void testField() throws Exception{
        Class<?> aClass = Class.forName("com.day1001.java.Person");
        Field age = aClass.getDeclaredField("age");
    }
}
