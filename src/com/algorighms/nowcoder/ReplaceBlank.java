package com.algorighms.nowcoder;

/**
 * 题目描述
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceBlank {

    public static String replaceSpace(StringBuffer str) {
        char[] chars = new char[str.length()];
        str.toString().getChars(0, str.length(), chars, 0);
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count++;
            }
        }
        char[] chars1 = new char[chars.length + 2 * count];
        int indexA = 0, indexB = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[indexA] == ' ') {
                chars1[indexB++] = '%';
                chars1[indexB++] = '2';
                chars1[indexB++] = '0';
                indexA++;
            } else {
                chars1[indexB] = chars[indexA];
                indexA++;
                indexB++;
            }
        }
        return new String(chars1);
    }
}
