package com.day906.java;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Yifei.Hu
 * @create 2021-09--10:03
 */
class Person{
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';

    }
}


public class ComparableTest {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0]=new Person(15,"Nike");
        people[1]=new Person(11,"Ni");
        people[2]=new Person(9,"Ne");
        people[3]=new Person(17,"Noo");
        people[4]=new Person(24,"dfe");
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge()==o2.getAge()){
                    return o1.getName().compareTo(o2.getName());
                }else{
                    return Integer.compare(o1.getAge(),o2.getAge());
                }
            }
        });

    }
}
