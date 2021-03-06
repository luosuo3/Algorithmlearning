package com.company.base_algorithm;

import java.util.Arrays;

/**
 * @author 王峥
 * @date 2020/7/25 3:12 下午
 *
 * 归并排序的思想是，利用二分的特性，将序列分成两个子序列进行排序，将排序后的两个子序列归并（合并），
 * 当序列的长度为2时，它的两个子序列长度为1，即视为有序，可直接合并，即达到归并排序的最小子状态.
 */
/**
 *归并排序的思想是，利用二分的特性，将序列分成两个子序列进行排序，将排序后的两个子序列归并（合并），
 * 当序列的长度为2时，它的两个子序列长度为1，即视为有序，可直接合并，即达到归并排序的最小子状态.
 */

/**
 *归并排序的最好，最坏和平均时间复杂度都是O(n*logn)。但需要O(n)的辅助空间。归并排序是稳定的。
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {16, 7, 3, 20, 17, 8};
        int[] ints = MergeSort(nums);
        for (int num : ints) {
            System.out.println(num);
        }

    }

    public static int[] MergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(MergeSort(left), MergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }

}
