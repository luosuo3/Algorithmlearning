package com;

import java.util.*;

/**
 * @author 王峥
 * @date 2020/8/6 7:12 下午
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {1,0,1,0,3};
        moveZeroes(a);
    }
    public  static void moveZeroes(int[] nums) {
        int k = -1; // 记录第一个0的位置
        for (int i =0 ;i < nums.length; i++) {
            int t = nums[i];
            if (t == 0) {
                // 如果前面没有出现过0则记录第一个0的位置为当前位置
                if (k == -1) {
                    k = i;
                }
                continue;
            }
            if (k > -1) {
                // 前面有0，则将当前位置的值与0进行交换，并将0的位置加1即可
                swarp(nums, i, k);
                k++;
            }
        }
        System.out.println(nums);
    }

    private static void swarp(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
