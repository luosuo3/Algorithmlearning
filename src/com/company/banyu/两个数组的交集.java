package com.company.banyu;

import java.util.HashSet;
import java.util.Set;

class 两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nmsl = new HashSet<>();
        for (int i = 0; i < nums1.length; ++i) {
            nmsl.add(nums1[i]);
        }
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < nums2.length; ++i) {
            if (nmsl.contains(nums2[i])) res.add(nums2[i]);
        }
        int[] ans = new int[res.size()];
        int count = 0;
        for (Integer i : res) {
            ans[count++] = i;
        }
        return ans;
    }
}

//https://leetcode-cn.com/problems/intersection-of-two-arrays/solution/po-shi-wu-hua-di-diao-you-xiao-by-xiao-bu-ai-chi-r/
