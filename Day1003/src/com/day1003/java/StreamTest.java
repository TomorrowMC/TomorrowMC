package com.day1003.java;

import org.junit.Test;

import java.util.stream.Stream;

/**
 * @author Yifei.Hu
 * @create 2021-10--11:56
 */
public class StreamTest {
    @Test
    public void test1(){
        int[] ints = new int[] {199, 2, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12,12,12,12,12, 13};
    Stream stream= Stream.of(ints);


    }
}
