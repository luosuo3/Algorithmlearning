
package com.company.primary_algorithm.string;

import java.util.Arrays;

class 有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) {
            return false;
        }
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}