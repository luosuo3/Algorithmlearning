package com.company.primary_algorithm.string;//实现 strStr() 函数。
//
// 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如
//果不存在，则返回 -1。 
//
// 示例 1: 
//
// 输入: haystack = "hello", needle = "ll"
//输出: 2
// 
//
// 示例 2: 
//
// 输入: haystack = "aaaaa", needle = "bba"
//输出: -1
// 
//
// 说明: 
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。 
// Related Topics 双指针 字符串 
// 👍 548 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class 实现strStr {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int lenH = haystack.length(), lenN = needle.length();
        if (lenN > lenH) {
            return -1;
        }
        // 在 haystack 中遍历所有可能的 needle 开始位置。
        for (int start = 0; start < lenH - lenN + 1; start++) {
            // 判断从当前位置开始与 needle 相同长度的字符串是否内容相同。
            if (haystack.substring(start, start + lenN).equals(needle)) {
                return start;
            }
        }
        return -1;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
