package com.netease.work.mock.leetcode.juzhen;

/**
 * description:
 * Date: 2019-11-17 下午7:03<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MaxCount {
    public int maxCount(int m, int n, int[][] ops) {
        if (m == 0 || n == 0) return 0;
        if (ops.length == 0) return m*n;

        int ans = 1;
        for (int i = 0; i < 2; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < ops.length; j++) {
                if (min > ops[j][i]) {
                    min = ops[j][i];
                }
            }
            if (m >= min || n >= min) {
                ans *= min;
            }
        }

        return ans;
    }
}
