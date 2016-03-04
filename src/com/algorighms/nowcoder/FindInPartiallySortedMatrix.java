package com.algorighms.nowcoder;

/**
 * 题目描述
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindInPartiallySortedMatrix {

    public boolean Find(int[][] array, int target) {
        boolean found = false;
        int row = array.length;
        int col = array[0].length;
        if (array != null && row > 0 && col > 0) {
            int nowRow = 0;
            int nowCol = col - 1;
            while ((nowRow < row) && (nowCol >= 0)) {
                if (array[nowRow][nowCol] == target) {
                    found = true;
                    break;
                } else if (target < array[nowRow][nowCol]) {
                    nowCol--;
                } else {
                    nowRow++;
                }
            }
        }
        return found;
    }

}
