package com.algorighms.lintcode;

/**
 * Created by sunao on 2016/2/18.
 */
public class LintCode383 {
    /**
     * @param heights: an array of integers
     * @return: an integer
     */
    public int maxArea(int[] heights) {
        int max = 0;
        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            max = max(min(heights[left], heights[right]) * (right - left), max);
            if (heights[right] > heights[left]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public int min(int a, int b) {
        return a > b ? b : a;
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }


}
