package com.company.base_algorithm;

/**
 * @author 王峥
 * @date 2020/7/21 10:21 下午
 */
public class BubbleSort {
    public static int[] bubbleSort(int [] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length-i-1; j++) {
                if (array[j+i]<array[j]) {
                    int temp = array[j + i];
                    array[j + i] = array[j];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
