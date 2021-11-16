package com.day908.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Yifei.Hu
 * @create 2021-09--10:47
 */
public class CollectionTest {
    @Test
    public void test1(){
        Collection c1 = new ArrayList();
        c1.add(123);
        c1.add(123);
        c1.add(123);
        c1.remove(123);
        System.out.println(c1);
        List ints = Arrays.asList(1,23,334);
        System.out.println(ints);
        for (Object obj :
                c1) {

        }
    }
}
