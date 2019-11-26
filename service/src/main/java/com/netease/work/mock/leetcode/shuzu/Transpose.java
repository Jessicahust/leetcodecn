package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-13 下午8:19<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class Transpose {

    public int[][] transpose(int[][] A) {
        if (A.length == 0 || A[0].length == 0) {
            return new int[0][0];
        }
        int m = A.length;
        int n = A[0].length;
        int[][] result = new int[n][m];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
}
