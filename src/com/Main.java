package com;

import java.util.*;

/**
 * @author 王峥
 * @date 2020/8/6 7:12 下午
 */
public class Main {
    public static void main(String[] args) {
        frequencySort("traeeaaa");
    }
    public static String frequencySort (String s) {
        String s1 ="";
        char[] chars = new char[s.length()];
        ArrayList<Character> characters = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        Arrays.sort(chars);
        for (char aChar : chars) {
            s1 += aChar;
        }
        return s1;
        // write code here
    }

}
