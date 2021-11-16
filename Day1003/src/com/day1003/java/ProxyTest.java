package com.day1003.java;

/**
 * @author Yifei.Hu
 * @create 2021-10--10:49
 */
public class ProxyTest {
    interface Human {
	String getbelief();
    void getFavorateFood();
    }

    class Superman implements Human{

        @Override
        public String getbelief() {
            return "基督教";
        }

        @Override
        public void getFavorateFood() {
            System.out.println("四川麻辣烫");;
        }
    }


}
