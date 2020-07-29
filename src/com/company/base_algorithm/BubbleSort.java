package com.company.base_algorithm;

/**
 * @author 王峥
 * @date 2020/7/21 10:21 下午
 */

/**
 *空间复杂度就是在交换元素时那个临时变量所占的内存空间；
 * 最优的空间复杂度就是开始元素顺序已经排好了，则空间复杂度为：0；
 * 最差的空间复杂度就是开始元素逆序排序了，则空间复杂度为：O(n)；
 * 平均的空间复杂度为：O(1)；
 */

/**
 *时间复杂度O(n^2)
 */

/**
 *冒泡排序就是把小的元素往前调或者把大的元素往后调。比较是相邻的两个元素比较
 * ，交换也发生在这两个元素之间。所以，如果两个元素相等，我想你是不会再无聊地把他们俩交换一下的；
 * 如果两个相等的元素没有相邻，那么即使通过前面的两两交换把两个相邻起来，这时候也不会交换，所以相同元素的前后顺序并没有改变，
 * 所以冒泡排序是一种稳定排序算法。
 * 也可以说不会影响其他不符合条件的元素所以说是稳定的.
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
