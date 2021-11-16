package com.day1001.java;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Yifei.Hu
 * @create 2021-10--11:34
 */
public class FieldTest  {
    @Test
    public void test() throws Exception{
        Class clazz = Class.forName("com.day1001.java.Person");
        for (Field field : clazz.getDeclaredFields()) {
            int modifiers = field.getModifiers();
            Class<?> type = field.getType();
            String name = field.getName();

        }


    }
    @Test
    public void test2() throws Exception{
        Class clazz = Class.forName("com.day1001.java.Person");
//        Method declaredMethod = clazz.getDeclaredMethod();
//        Method method1 = clazz.getMethod();
        for (Method method : clazz.getMethods()) {
            System.out.println(method);
            int modifiers = method.getModifiers();
            System.out.println(Modifier.toString(modifiers));
            Class<?> returnType = method.getReturnType();
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] exceptionTypes = method.getExceptionTypes();
        }

    }
}
