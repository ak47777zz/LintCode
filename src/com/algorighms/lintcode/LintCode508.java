package com.algorighms.lintcode;

import java.util.Arrays;

/**
 * Given an unsorted array nums, reorder it in-place such that
 * nums[0] <= nums[1] >= nums[2] <= nums[3]....
 * https://segmentfault.com/a/1190000003783283
 */
public class LintCode508 {
    /**
     * @param nums a list of integer
     * @return void
     */
    public static void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        // 先将数组排序
        Arrays.sort(nums);
        // 将数组中一对一对交换
        for (int i = 2; i < nums.length; i += 2) {
            int tmp = nums[i - 1];
            nums[i - 1] = nums[i];
            nums[i] = tmp;
        }
    }
}
