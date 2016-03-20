package com.algorighms.nowcoder;

/**
 * 统计一个数字在排序数组中出现的次数。
 */
public class GetNumberOfK {

    public static int GetNumberOfK(int[] array, int k) {
        int left = 0;
        int right = array.length - 1;
        int num = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == k) {
                num = count(array, mid);
                break;
            } else if (array[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return num;
    }

    private static int count(int[] array, int mid) {
        int num = 1;
        int i = 1;
        while (mid - i >= 0 && (array[mid - i] == array[mid])) {
            num++;
            i++;
        }
        i = 1;
        while (mid + i <= array.length - 1 && (array[mid + i] == array[mid])) {
            num++;
            i++;
        }
        return num;
    }

}
