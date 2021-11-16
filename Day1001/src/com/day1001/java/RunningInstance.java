package com.day1001.java;

import org.junit.Test;

/**
 * @author Yifei.Hu
 * @create 2021-10--10:59
 */
public class RunningInstance {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("Person");
        Object obj = clazz.newInstance();
    }

    @Test
    public void test1() {

    }
//创建了一个指定类的对象
    public Object test2(String classPath) throws Exception {
        Class<?> aClass = Class.forName(classPath);
        return aClass.newInstance();
    }

}
