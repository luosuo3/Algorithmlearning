package com.company.primary_algorithm.string;//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
//
// 
//
// 示例： 
//
// s = "leetcode"
//返回 0
//
//s = "loveleetcode"
//返回 2
// 
//
// 
//
// 提示：你可以假定该字符串只包含小写字母。 
// Related Topics 哈希表 字符串 
// 👍 256 👎 0


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class 字符串中第一个唯一字符 {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count=new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for (int i = 0; i < len; i++) {
            if (count.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
