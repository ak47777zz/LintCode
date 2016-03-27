package com.algorighms.nowcoder;

/**
 * 移除排序数组中重复元素
 */
public class RemoveDuplicatesfromSortedArray {

    public static void removeDuplicates(int[] array) {
        if (array.length == 0 || array.length == 1 || array == null) {
            return;
        }
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                continue;
            } else {
                array[count] = array[i];
                count++;
            }
        }
        for (int i = count; i < array.length; i++) {
            array[i] = 0;
        }
        print(array);
    }

    private static void print(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 1, 2, 2, 2, 3, 4, 5, 6});
    }
}
