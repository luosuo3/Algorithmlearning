package com.company.primary_algorithm.array;//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 701 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class 移动0 {
    public void moveZeroes(int[] nums) {
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
    }

    private void swarp(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
