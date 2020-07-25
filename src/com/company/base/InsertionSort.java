package com.company.base;

/**
 * @author 王峥
 * @date 2020/7/25 10:35 上午
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 3, 7, 6, 9};
        InsertionSort.insertionSort(array);
    }
    public static int[] insertionSort(int [] array) {
        if (array.length == 0) {
            return array;
        }
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        for (int i : array) {
            System.out.println(i);
        }
        return array;
    }

}
