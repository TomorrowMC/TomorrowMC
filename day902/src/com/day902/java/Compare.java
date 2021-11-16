package com.day902.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * @author Yifei.Hu
 * @create 2021-09--14:18
 */
class good implements Comparable {
    private int price;
    private String name;

    public good() {
    }

    public good(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "good{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) throws RuntimeException {
        if (o instanceof good) {
            return Integer.compare(this.price, ((good) o).price);
        } else {
            throw new RuntimeException("输入错误");
        }
    }
}

public class Compare {
    @Test
    public void test() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse("2017-08-16");
        System.out.println(date.toString());
        DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("yyyy-MM-dd");
       TemporalAccessor temporalAccessor = dateTimeFormatter.parse("2017-08-16");
        System.out.println(temporalAccessor);
    }
}
