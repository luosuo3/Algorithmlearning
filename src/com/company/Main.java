package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1,1,2,2,3,4,4,5,5};
        int i = singleNumber(nums);
        System.out.println(i);
    }
    public static int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }
}
