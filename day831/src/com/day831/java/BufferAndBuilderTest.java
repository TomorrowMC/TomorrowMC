package com.day831.java;

import org.junit.Test;

/**
 * @author Yifei.Hu
 * @create 2021-09--14:10
 */
public class BufferAndBuilderTest {
    @Test
    public void test() throws ClassNotFoundException {
        StringBuffer sb1 = new StringBuffer();
        sb1.append(213123);
        System.out.println(sb1);

        sb1.delete(0, 2);
        System.out.println(sb1);

        //借用这个地方试一下反射
        Class clazz= Class.forName("com.day831.java.DateTest1");
        System.out.println(clazz);
    }
}
