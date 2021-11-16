package com.day1001.java;

/**
 * @author Yifei.Hu
 * @create 2021-10--15:50
 */
public class Person {
   private String name;
   public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static int get1() {
        return 1;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "com.day1001.java.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
