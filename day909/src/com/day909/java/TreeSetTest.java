package com.day909.java;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Yifei.Hu
 * @create 2021-09--15:52
 */
class Employee implements Comparable{
    private String name;
    private  int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }


    @Override
    public int compareTo(Object o) {
        Employee e1 = (Employee) o;
        return this.name.compareTo(e1.name);
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}


public class TreeSetTest {
    public static void main(String[] args) {
        //实现Comparable接口，通过姓名排序
        TreeSet treeSet = new TreeSet();
        Employee e1 = new Employee("刘德华",55,new MyDate(2001,04,05));
        Employee e2 = new Employee("胡逸飞",19,new MyDate(2001,05,07));
        Employee e3 = new Employee("成龙",67,new MyDate(2003,04,05));
        Employee e4 = new Employee("梁朝伟",55,new MyDate(2004,04,05));
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        Iterator it=treeSet.iterator();
        while (it.hasNext()!= false){
            System.out.println(it.next());
        }
        //使用定制排序按照生日排序
        TreeSet treeSet1 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;
                    if (e1.getBirthday().getYear() != e2.getBirthday().getYear()) {
                        return -Integer.compare(e1.getBirthday().getYear(), e2.getBirthday().getYear());
                    } else {
                        return -Integer.compare(e1.getBirthday().getMonth(), e2.getBirthday().getMonth());
                    }
                } else {
                    return 0;
                }
            }
        });

        treeSet1.add(e1);
        treeSet1.add(e2);
        treeSet1.add(e3);
        treeSet1.add(e4);
        Iterator it1=treeSet1.iterator();
        while (it1.hasNext()!= false){
            System.out.println(it1.next());
        }
    }
}
