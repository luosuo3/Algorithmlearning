package com.company.banyu;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author 王峥
 * @date 2021/1/7 12:03 上午
 */
public class 独一无二的出现次数 {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> counter = new HashMap<>();
        for (int elem : arr)
            counter.put(elem, counter.getOrDefault(elem, 0) + 1);

        return counter.size() == new HashSet<Integer>(counter.values()).size();
    }
}
