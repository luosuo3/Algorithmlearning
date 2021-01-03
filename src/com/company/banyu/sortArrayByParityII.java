package com.company.banyu;

/**
 * @author 王峥
 * @date 2021/1/3 2:27 下午
 */

/*
给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。

对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。

你可以返回任何满足上述条件的数组作为答案。
* */
public class sortArrayByParityII {
    public static int[] sort(int [] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int event = 0;
        int odd = 1;
        while (event< nums.length && odd <nums.length) {
            while (event < nums.length && nums[event] % 2 == 0) {
                event += 2;
            }
            while (odd < nums.length && nums[odd] % 2 != 0) {
                odd += 2;
            }
            if (event < nums.length && odd < nums.length) {
                int temp = nums[event];
                nums[event] = nums[odd];
                nums[odd] = temp;
            }
            event += 2;
            odd += 2;

        }
        return nums;

    }
}
