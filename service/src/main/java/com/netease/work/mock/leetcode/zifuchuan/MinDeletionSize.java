package com.netease.work.mock.leetcode.zifuchuan;

/**
 * description:
 * Date: 2019-11-18 下午7:39<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MinDeletionSize {

    public int minDeletionSize(String[] A) {
        if (A.length == 0) {
            return 0;
        }
        int len = A[0].length();
        int size = 0;
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < A.length - 1; ++j) {
                String s1 = A[j];
                String s2 = A[j + 1];
                if (s1.charAt(i) > s2.charAt(i)) {
                    ++size;
                    break;
                }
            }
        }
        return size;
    }
}
