package com.day1001.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Yifei.Hu
 * @create 2021-10--15:06
 */
public class ConsTest {
    @Test
    public void ConstructorTest() throws Exception{
       Class clazz= Class.forName("com.day1001.java.Person");
        Constructor[] constructors = clazz.getConstructors();
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();

    }
    @Test
    public void test2()throws Exception{
        Class clazz = Class.forName("com.day1001.java.Person");
        Class[] interfaces = clazz.getInterfaces();
        Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for (Class in:
             interfaces1) {
            System.out.println(in);
        }
    }

    @Test
    public void test3() throws Exception{
        Class clazz = Class.forName("com.day1001.java.Person");
        clazz.getPackageName();
    }
}
