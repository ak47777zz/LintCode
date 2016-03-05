package com.algorighms.nowcoder;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Power {
    public double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        double num = base;
        int temp = exponent > 0 ? exponent : -exponent;
        for (int i = 1; i < temp; i++) {
            num = num * base;
        }
        return exponent > 0 ? num : 1 / num;
    }
}

/*if (exponent == 0) {
        return 1;
        }
        double num = base;
        if (exponent > 0) {
        for (int i = 1; i < exponent; i++) {
        num = num * base;
        }
        return num;
        } else {
        exponent = -exponent;
        for (int i = 1; i < exponent; i++) {
        num = num * base;
        }
        return 1 / num;
        }*/
