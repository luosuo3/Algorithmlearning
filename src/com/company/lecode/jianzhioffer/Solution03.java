package com.company.lecode.jianzhioffer;//在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
//
// 
//
// 示例 1： 
//
// 输入：nums = [3,4,3,3]
//输出：4
// 
//
// 示例 2： 
//
// 输入：nums = [9,1,7,9,7,9,7]
//输出：1 
//
// 
//
// 限制： 
//
// 
// 1 <= nums.length <= 10000 
// 1 <= nums[i] < 2^31 
// 
//
// 
// 👍 50 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution03 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        for (int i : nums) {
            Integer count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    count++;
                }
            }
            numberMap.put(i, count);
        }
        for (Integer integer : numberMap.keySet()) {
            if (numberMap.get(integer) == 1) {
                return integer;
            }
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
