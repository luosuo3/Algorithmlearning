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
    public static void main(String[] args) {
        int[] nums = {16,7,3,20,17,8};
        heapSort(nums);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);

        }
    }
    public static void heapSort(int[] nums) {
        if (nums == null) {
            throw new RuntimeException("数组为空");
        }
        int length = nums.length;
        for (int i = length - 1; i >= 0; i--) {
            sortHeap(nums, i);
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
        }
    }
    public static void sortHeap(int[] nums, int end) {
        int length = nums.length;
        for (int i = (end - 1) / 2; i >= 0; i--) {
            sortNode(nums, i, end);
        }

    }
    public static void sortNode(int[] nums, int head, int end) {
        if (head < 0) {
            throw new RuntimeException("堆顶超过左边界");
        }
        int length = nums.length;
        //左子节点坐标
        int left = head * 2 + 1;
        //右子节点坐标
        int right = left + 1;
        //判断左子节点是否存在
        if (left <= end) {
            //如果左子节点更大，交换
            if (nums[left] > nums[head]) {
                int temp = nums[head];
                nums[head] = nums[left];
                nums[left] = temp;
            }
        }
        //判断右子节点是否存在
        if (right <= end) {
            //如果右子节点更大，交换
            if (nums[right] > nums[head]) {
                int temp = nums[head];
                nums[head] = nums[right];
                nums[right] = temp;
            }
        }
    }
}
