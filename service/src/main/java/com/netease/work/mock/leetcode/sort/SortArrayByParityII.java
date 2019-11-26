package com.netease.work.mock.leetcode.sort;

/**
 * description:
 * Date: 2019-10-05 下午8:23<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] A) {
        if (A.length == 0) {
            return A;
        }
        int i = 1;
        for (int j = 0; j < A.length; j += 2) {
            if (A[j] % 2 != 0) {
                while (A[i] % 2 != 0) {
                    i = i + 2;
                }
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }
}
