package com;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Yifei.Hu
 * @create 2021-10--16:05
 */
public class EX4_2 {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 4, 7,76,543,324,24,345,65,23314,234453,56,442,234,234,6543};
        int[] ints2 = EX4_2.copyEven1(ints);
        System.out.println(Arrays.toString(ints2));
        System.out.println(ints2.length);
    }

    public static int[] copyEven(int[] nums) {
        int numsOfEven = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                numsOfEven++;
            }
        }
        int[] ints = new int[numsOfEven];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                ints[j] = nums[i];
                j++;
            }
        }
        return ints;
    }

    public static int[] copyEven1(int[] nums) {
        int numsOfEven = 0;
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (int i = 0, j = 0; i < nums.length; i++, j++) {
            if (nums[i] % 2 == 1) {
                ints.add(nums[i]);
            }
        }
        Object[] intsx =  ints.toArray();
        int[] ints12=new int[intsx.length];
        for (int i = 0; i < intsx.length; i++) {
            ints12[i] = (Integer) intsx[i];
        }
        return ints12;
    }
}
