package com.company.base_algorithm;

/**
 * @author 王峥
 * @date 2020/7/25 10:35 上午
 * <p>
 * 两重循环，最差和平均时间复杂度为O(n2)，最好情况是原序列已有序，则忽略内层循环，时间复杂度O(n)。插入排序是稳定的。
 * <p>
 * 两重循环，最差和平均时间复杂度为O(n2)，最好情况是原序列已有序，则忽略内层循环，时间复杂度O(n)。插入排序是稳定的。
 */

/**
 *两重循环，最差和平均时间复杂度为O(n2)，最好情况是原序列已有序，则忽略内层循环，时间复杂度O(n)。插入排序是稳定的。
 */

/**
 *这里，内层循环我们用的是从后向前遍历，来找到合适的插入位置，而内层循环所遍历的，是已排序的数组，所以我们可以使用二分查找来寻找插入位置，
 * 从而使时间复杂度提高到O(n*log n)。
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {11, 8, 5, 3, 7, 6, 9};
//        InsertionSort.insertionSort(array);
        InsertionSort.insertionSort2(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] insertionSort(int[] array) {
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

    public static void insertionSort2(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < nums[j]) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j + 1] = value;
        }
    }

}
