package com.algorighms.nowcoder;

/**
 * 世界上有10种人，一种懂二进制，一种不懂。
 * 那么你知道两个int32整数m和n的二进制表达，有多少个位(bit)不同么？
 * 输入例子: 1999 2299
 * 输出例子: 7
 */
public class KnowBinary {
    /**
     * 获得两个整形二进制表达位数不同的数量
     *
     * @param m 整数m
     * @param n 整数n
     * @return 整型
     */
    public int countBitDiff(int m, int n) {
        int num = m ^ n;
        int i = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                i++;
            }
            num >>= 1;
        }
        return i;
    }
}
