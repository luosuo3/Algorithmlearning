package com.company.banyu;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @author 王峥
 * @date 2021/1/3 4:23 下午
 */
public class lruCache {
    Queue<Integer> queue;
    Map<Integer, Integer> map;
    int cap;

    public lruCache() {
        this.queue = new LinkedList<>();
        this.map = new HashMap<>();
        this.cap = 0;
    }

    public int get(int key) {
        if (queue.contains(key)) {
            queue.remove(key);
            queue.add(key);
            return map.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key,int value) {
        if (queue.contains(key)) {
            queue.remove(key);
            queue.add(key);
            map.put(key, value);
        } else if (cap == 0) {
            map.remove(queue.poll());
            queue.remove(key);
            map.put(key, value);
        } else {
            queue.add(key);
            map.put(key, value);
            cap--;
        }
    }

}
