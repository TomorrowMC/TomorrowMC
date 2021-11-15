package com;

/**
 * @author Yifei.Hu
 * @create 2021-10--01:11
 */
public class EX4_1 {

    public static void main(String[] args) {
        EX4_1 ex4_1 = new EX4_1();
        int[] ints = new int[]{1, 2, 5, 7, 8,43,345345,4567645,345,231,234,565,876,34,546,34,54,23,435};
        ex4_1.reverseInts(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public void reverseInts(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            nums[i] = nums[i] ^ nums[nums.length - i - 1];
            nums[nums.length - i - 1] = nums[i] ^ nums[nums.length - i - 1];
            nums[i] = nums[i] ^ nums[nums.length - i - 1];
        }
    }
}
