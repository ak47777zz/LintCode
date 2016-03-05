package com.algorighms.nowcoder;

import java.util.Arrays;

/**
 * Created by sunao on 2016/3/5.
 */
public class SelectSort {

    //选择排序
    public static int[] selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
        return array;
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = {9, 1, 5, 8, 3, 7, 4, 6, 2};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
