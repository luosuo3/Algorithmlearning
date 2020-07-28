package com.company.base_algorithm;

/**
 * @author 王峥
 * @date 2020/7/21 10:43 下午
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 3, 7, 6, 9};
        SelectionSort.selectionSort(array);
    }
    public static int[] selectionSort(int [] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i <array.length ; i++) {
            int minIndex = i;
            for (int j = i; j <array.length ; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            int i1 = array[i];
            System.out.println(i1);
        }
        return array;
    }
}
