package com.algorighms.nowcoder;

import java.util.HashSet;

/**
 * 题目描述对于一个字符串，请设计一个高效算法，找到第一次重复出现的字符。
 * 给定一个字符串(不一定全为字母)A及它的长度n。请返回第一个重复出现的字符。
 * 保证字符串中有重复字符，字符串的长度小于等于500。
 * 测试样例："qywyer23tdd",11返回：y
 */
public class FirstRepeat {

    public static char findFirstRepeat(String A, int n) {
        char[] chars = new char[n];
        A.getChars(0, n, chars, 0);
        HashSet<Character> hashSet = new HashSet<>();
        char target = ' ';
        for (char c : chars) {
            if (hashSet.contains(c)) {
                target = c;
                break;
            } else {
                hashSet.add(c);
            }
        }
        return target;
    }
}