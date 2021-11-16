package com.day908.java;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Yifei.Hu
 * @create 2021-09--15:42
 */
public class ListTest {
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListTest listTest = (ListTest) o;

        return age == listTest.age;
    }

    @Override
    public int hashCode() {
        return age;
    }

    @Test
    public void test() {
        HashSet arrayList = new HashSet(60);
        arrayList.add(21312);
        arrayList.add(134324);
        arrayList.add(135324);
        arrayList.remove(0);
        Integer[] ints = {123, 213};
        Integer[] is=ints;
        System.out.println(arrayList.size());
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()!=false){
            System.out.println(iterator.next());
        }
        for (Object obj :
                arrayList) {
            if (obj instanceof Integer){
                int i = (Integer) obj;
                System.out.println(i);
            }
        }
    }
};
