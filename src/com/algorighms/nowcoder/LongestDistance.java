package com.algorighms.nowcoder;

/**
 * 有一个长为n的数组A，求满足0≤a≤b<n的A[b]-A[a]的最大值。
 * 给定数组A及它的大小n，请返回最大差值。测试样例：
 * [10,5],2          返回：0
 */
public class LongestDistance {
    public int getDis(int[] A, int n) {
        //记录最大差值
        int dis = 0;
        if (n > 1) {
            //记录最小值
            int min = A[0];
            //当前值与最小相减，进行判断
            for (int i = 0; i < n; i++) {
                if (A[i] - min > dis) {
                    dis = A[i] - min;
                }
                if (A[i] < min) {
                    min = A[i];
                }
            }
        }
        return dis;
    }
}