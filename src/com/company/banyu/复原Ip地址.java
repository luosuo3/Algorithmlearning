package com.company.banyu;

import java.util.LinkedList;
import java.util.List;

class 复原Ip地址 {
    List<String> res = new LinkedList<>();
    
    private void backtrack(String combination,String next_str,int cur){
        if(cur == 3){
            //拼接第四个，如果长度小于等于0或者大于3，则不拼接，同str1，此时的值可以为0，判断与str1一致
            if(next_str.length() > 0 && next_str.length() <= 3 && ((Integer.valueOf(next_str) == 0 && next_str.length() <= 1) || (Integer.valueOf(next_str) >= 1 && next_str.charAt(0) != '0' && Integer.valueOf(next_str) <= 255) )){
                combination += next_str;
                res.add(combination);
            }
            return;
        }
        
        //分割一个数字
        if(next_str.length() >= 1){
            String str1 = next_str.substring(0,1);
            //str1的值可以为0，但不能为01，故当值为 >= 1 && <= 255 时需要判断第一位是否为0即str1.charAt(0) != '0'
            if(Integer.valueOf(str1) == 0 || (Integer.valueOf(str1) >= 1 && str1.charAt(0) != '0' && Integer.valueOf(str1) <= 255 ))
                backtrack(combination + str1 + ".",next_str.substring(1),cur + 1);
        }
        
        //分割两个数字
        if(next_str.length() >= 2){
            String str2 = next_str.substring(0,2);
            //str2的值不能是00 故判断为 >= 1 && <= 255
            if(Integer.valueOf(str2) >= 1 && str2.charAt(0) != '0' && Integer.valueOf(str2) <= 255 )
                backtrack(combination + str2 + ".",next_str.substring(2),cur + 1);
        }
        
        //分割三个数字
        if(next_str.length() >= 3){
            String str3 = next_str.substring(0,3);
            //str3的值不能是000 故判断为 >= 1 && <= 255
            if(Integer.valueOf(str3) >= 1 && str3.charAt(0) != '0' && Integer.valueOf(str3) <= 255 )
                backtrack(combination + str3 + ".",next_str.substring(3),cur + 1);
        }
        
                      
    }
    
    public List<String> restoreIpAddresses(String s) {
        if(s.length() < 4 || s.length() > 12)
            return res;
        if(s != null && s.length() > 0)
            backtrack("",s,0);
        
        
        return res;
    }
}

//https://leetcode-cn.com/problems/restore-ip-addresses/solution/fu-yuan-ipdi-zhi-by-lsz/
