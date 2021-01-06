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
        int even = 0;
        int odd = 1;
        while (even< nums.length && odd <nums.length) {
            while (even < nums.length && nums[even] % 2 == 0) {
                even += 2;
            }
            while (odd < nums.length && nums[odd] % 2 != 0) {
                odd += 2;
            }
            if (even < nums.length && odd < nums.length) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
            even += 2;
            odd += 2;

        }
        return nums;
    }

    public static int [] sort2(int[] nums) {
        if (nums.length<=1) {
            return nums;
        }
        int even = 0;
        int odd = 1;
        while (even < nums.length && nums[even] % 2 == 0) {
            even += 2;
        }
        while (odd < nums.length && nums[even] % 2 != 0) {
            odd += 2;
        }
        if (even<nums.length&&odd<nums.length) {
            int temp = nums[even];
            nums[even] = nums[odd];
            nums[odd] = temp;
        }
        odd += 2;
        even += 2;
        return nums;
    }
}
