package com.algorighms.nowcoder;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    //冒泡排序
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
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
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

}


