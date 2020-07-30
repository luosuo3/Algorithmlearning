package com.company.base_algorithm;

/**
 * @author 王峥
 * @date 2020/7/29 10:11 下午
 */

/**
 *堆排序的整个过程中充分利用的二分思想，它的最好、最坏和平均时间复杂度都是O(nlogn)。
 * 堆排序不需要额外的空间。堆排序的交换过程不连续，显然是不稳定的。
 */
public class Heapsort {
    void updateHeap(int a[], int i, int n) {
        int iMax = i,
                iLeft = 2 * i + 1,
                iRight = 2 * (i + 1);
        if (iLeft < n && a[iMax] < a[iLeft]) {
            iMax = iLeft;
        }
        if (iRight < n && a[iMax] < a[iRight]) {
            iMax = iRight;
        }
        if (iMax != i) {
            int tmp = a[iMax];
            a[iMax] = a[i];
            a[i] = tmp;
            updateHeap(a, iMax, n);
        }
    }

    void heapSort(int a[], int n) {
        for (int i = (n - 1) / 2; i >= 0; i--) {
            updateHeap(a, i, n);
        }
        for (int i = n - 1; i > 0; --i) {
            int tmp = a[i];
            a[i] = a[0];
            a[0] = tmp;
            updateHeap(a, i, n);
        }
    }
}
