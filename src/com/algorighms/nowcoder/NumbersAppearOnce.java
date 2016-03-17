package com.algorighms.nowcoder;

import java.util.ArrayList;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 * num1,num2分别为长度为1的数组。传出参数
 * 将num1[0],num2[0]设置为返回结果
 */
public class NumbersAppearOnce {

    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length == 1) {
            num1[0] = 0;
            num2[0] = 0;
        }
        int num = 0;
        for (Integer i : array) {
            num ^= array[i];
        }
        //找到num右侧第一位1  i为右移了几位
        int i = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                break;
            }
            num = num >> 1;
            i++;
        }
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int j = 0; j < array.length; j++) {
            if (((array[j] >> i) & 1) == 1) {
                array1.add(array[j]);
            } else {
                array2.add(array[j]);
            }
        }
        //每组异或运算
        for (Integer integer : array1) {
            num1[0] ^= integer;
        }
        for (Integer integer : array2) {
            num2[0] ^= integer;
        }
    }
}
