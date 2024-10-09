package com.company.primary_algorithm.string;//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 示例 1: 
//
// 输入: "A man, a plan, a canal: Panama"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "race a car"
//输出: false
// 
// Related Topics 双指针 字符串 
// 👍 266 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class 验证回文串 {
    public boolean isPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stringBuffer.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer stringBuffer1 = new StringBuffer(stringBuffer).reverse();
        return stringBuffer.toString().equals(stringBuffer1.toString());
    }
}
//leetcode submit region end(Prohibit modification and deletion)
