package com.company.banyu;

/**
 * @author 王峥
 * @date 2021/1/4 9:59 下午
 */
public class maxArea {
        public int maxArea(int[] nums) {
            int i = 0, j = nums.length - 1, res = 0;
            while (i < j) {
                res = nums[i] < nums[j]?
                        Math.max(res,(j-i)*nums[i++]):
                        Math.max(res,(j-i)*nums[j++]);
            }
            return res;
        }

}
