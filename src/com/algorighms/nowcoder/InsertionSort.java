package com.algorighms.nowcoder;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertionSort {

    public static int[] insertionSort(int[] A, int n) {
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (A[j] > A[j - 1]) {
                    break;
                } else {
                    swap(A, j, j - 1);
                }
            }
        }
        return A;
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] array = {9, 1, 5, 8, 3, 7, 4, 6, 2};
        insertionSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

}