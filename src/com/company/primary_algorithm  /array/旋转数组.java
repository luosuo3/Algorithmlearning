package com.company.primary_algorithm.array;//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
//
// 示例 1: 
//
// 输入: [1,2,3,4,5,6,7] 和 k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右旋转 1 步: [7,1,2,3,4,5,6]
//向右旋转 2 步: [6,7,1,2,3,4,5]
//向右旋转 3 步: [5,6,7,1,2,3,4]
// 
//
// 示例 2: 
//
// 输入: [-1,-100,3,99] 和 k = 2
//输出: [3,99,-1,-100]
//解释: 
//向右旋转 1 步: [99,-1,-100,3]
//向右旋转 2 步: [3,99,-1,-100] 
//
// 说明: 
//
// 
// 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。 
// 要求使用空间复杂度为 O(1) 的 原地 算法。 
// 
// Related Topics 数组 
// 👍 640 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class 旋转数组 {
    //    一个一个替换
    public void rotate01(int[] nums, int k) {
        k = k % nums.length;
        for (int i = 0; i < k; i++) {
            int fir = nums[nums.length - 1];
            for (int j = nums.length - 2; j >=0; j--) {
                nums[j + 1] = nums[j];
            }
            nums[0] = fir;
        }
    }

    //    将旧数组的元素按照替换后的位置重新赋给新数组
    public void rotate02(int[] nums, int k) {
        k = k % nums.length;
        int[] nnums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = (i + k) % nums.length;
            nnums[num] = nums[i];

        }
        for (int i = 0; i < nnums.length; i++) {
            nums[i] = nnums[i];
        }
    }
    //使用反转，先将整个数组反转，然后反转前k个元素，最后再反转后n-k个元素，时间复杂度为O(n)，空间复杂度O(1)

    public void rotate03(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    public void reverse(int[] nums, int start, int end) {
        int temp;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
