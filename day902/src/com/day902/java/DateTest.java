package com.day902.java;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * @author Yifei.Hu
 * @create 2021-09--16:03
 */
public class DateTest {
    @Test
    public void test(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));
    }
}
