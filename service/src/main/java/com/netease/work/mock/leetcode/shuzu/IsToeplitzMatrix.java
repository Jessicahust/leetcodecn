package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-27 下午8:17<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsToeplitzMatrix {
    public static void main(String[] args) {
        System.out.println(new IsToeplitzMatrix().isToeplitzMatrix(new int[][]{}));
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return true;
        }
        int l = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < l; ++i) {
            int line = i;
            int col = 0;
            while (line < l && col < c) {
                if (line > 0 && col > 0 && matrix[line][col] != matrix[line - 1][col - 1]) {
                    return false;
                }
                ++line;
                ++col;
            }
        }
        for (int i = 1;i<c;++i){
            int line = 0;
            int col = i;
            while (line<l&&col<c){
                if (line > 0 && col > 0 && matrix[line][col] != matrix[line - 1][col - 1]) {
                    return false;
                }
                ++line;
                ++col;
            }
        }
        return true;
    }
}
