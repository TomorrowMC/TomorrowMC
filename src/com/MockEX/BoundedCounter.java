package com.MockEX;/*
 * Mock Lab Test
 */



// The BoundedCounter class represents a single integer,
// that can only incremented by one up until the maximum value.
public class BoundedCounter extends Counter {
    
    // Do not modify or add the instance variables
    private int maxValue;
    
    // Mock Lab Test Question 3
    // Complete the constructor of the class BoundedCounter
    // It initializes all the instance variables
    // including the ones inherited from its parent class
    // You may assume that initialValue is less than maxValue
    public BoundedCounter(int initialValue, int maxValue) {
		super(initialValue);
        this.maxValue = maxValue;
		
		
    }    
    
    // Mock Lab Test Question 4
    // Complete and override the method increment.
    // It increments the counter value by one up until the maximum value.

    public void increment() {
        if (super.getValue()<maxValue) {
            super.increment();
        }


    }
    
    public static void main(String[] args) {
        
        BoundedCounter bc1 = new BoundedCounter(0, 100);
        bc1.increment();
        System.out.println(bc1);
        
        BoundedCounter bc2 = new BoundedCounter(3, 5);
        bc2.increment();
        System.out.println(bc2);
        bc2.increment();
        System.out.println(bc2);
        bc2.increment();
        System.out.println(bc2);        
        
        // add your own test cases
        
        
        
    }

}
