package com;

import java.util.Arrays;

/**
 * @author Yifei.Hu
 * @create 2021-10--15:08
 */
public class CW4_2 {
    public static void main(String[] args) {
        int[] ints = new int[]{11,55,100,200,300,7};
        int[] ints1 = CW4_2.intsTest(ints);
        System.out.println(Arrays.toString(ints1));
    }

    public static int[] intsTest(int[] nums) {
     int oddnums=0;
     int evennums = 0;
     int startIndex = 0;
     int endIndex = 0;
for (int i = 0; i < nums.length; i++) {

    if (nums[i]%2==1) {
        oddnums++;
    }else {
        evennums++;
    }


    if (oddnums==evennums) {
        int[] Oddints =  new int[oddnums];
        int[] Evenints =  new int[evennums];
        int k = 0,z =0;
        endIndex=i;
        int mediate=(startIndex+endIndex+1)/2;
        for (int j = startIndex; j <mediate ;j++) {
            if (nums[j]%2==1) {
                Oddints[k]=nums[j];
                k++;
            }else {
                Evenints[z]=nums[j];
                z++;
            }
        }
        for (int j = mediate; j <=endIndex ;j++) {
            if (nums[j]%2==1) {
                Oddints[k]=nums[j];
                k++;
            }else {
                Evenints[z]=nums[j];
                z++;
            }
        }
        k=0;
        z = 0;
        for (int j = startIndex; j <mediate ;j++) {
            if (nums[j]%2==1) {
                nums[j]=Evenints[k];
                k++;
            }else {
                nums[j]=Oddints[z];
                z++;
            }
        }

        for (int j = mediate; j <=endIndex ;j++) {
            if (nums[j]%2==1) {
                nums[j]=Evenints[k];
                k++;
            }else {
                nums[j]=Oddints[z];
                z++;
            }
        }
         oddnums=0;
         evennums = 0;
         startIndex = i+1;
    }

}
return nums;
    };
}
