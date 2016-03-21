package com.algorighms.nowcoder;

/**
 * 连续子数组的最大和
 * {6,-3,-2,7,-15,1,2,2}
 */
public class GreatestSumOfSubarrays {

    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (sum > max) {
                max = sum;
            }
            if (sum <= 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(FindGreatestSumOfSubArray(new int[]{-2, -8, -1,
                -5, -9}));
    }
}
