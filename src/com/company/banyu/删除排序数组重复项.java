package com.company.banyu;

/**
 * @author 王峥
 * @date 2021/1/6 11:14 下午
 */
public class 删除排序数组重复项 {

    public int removeDuplicates(int[] nums) {
        // 最大重复次数两次
        int maxRepeat = 2;
        // 慢指针slow指向索引为1的位置
        int slow = maxRepeat - 1;
        for(int fast = maxRepeat; fast < nums.length; fast++) {
            // nums[fast] != nums[slow - maxRepeat + 1]
            // 保证在区间[0,slow]中元素最多不会超过2次
            if (nums[fast] != nums[slow - maxRepeat + 1]) {
                // 先扩展区间
                slow++;
                // 再赋值
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
//    https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/solution/kuai-man-zhi-zhen-80-shan-chu-pai-xu-shu-4rnk/
}
