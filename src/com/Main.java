package com;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        String s = countAndSay(3);
        System.out.println(s);

    }

    public static String countAndSay(int n) {
        String str = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            char pre = str.charAt(0);
            int count = 1;
            for (int j = 1; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == pre) {
                    count++;
                } else {
                    stringBuilder.append(count).append(pre);
                    pre = c;
                    count = 1;
                }
            }
            stringBuilder.append(count).append(pre);
            str = stringBuilder.toString();
        }
        return str;
    }
}
