package com.algorighms.lintcode;

/**
 * 奇偶分割数组
 * 分割一个整数数组，使得奇数在前偶数在后。
 */
public class LintCode373 {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            //左边找到第一个偶数
            while (nums[left] % 2 != 0) {
                left++;
            }
            //右边找到第一个奇数
            while (nums[right] % 2 == 0) {
                right--;
            }
            //交换
            if (left < right) {
                exchange(nums, left, right);
            } else {
                return;
            }
        }
    }

    /**
     * 交换数组元素
     *
     * @param nums: 数组
     * @param a:    数组下标
     * @param b:    数组下标
     */
    public void exchange(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


}
