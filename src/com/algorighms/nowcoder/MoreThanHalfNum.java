package com.algorighms.nowcoder;

/**
 * 数组中出现次数超过一半的数字
 */
public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int num = array[0];
        int times = 1;
        for (int i = 1; i < array.length - 1; i++) {
            if (times == 0) {
                num = array[i];
                times = 1;
            } else if (array[i] == num) {
                times++;
            } else {
                times--;
            }
        }
        if (!isMoreThanHalf(array, num)) {
            return 0;
        }
        return num;
    }

    public boolean isMoreThanHalf(int[] array, int num) {
        int times = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                times++;
            }
        }
        return times > array.length / 2;
    }
}
