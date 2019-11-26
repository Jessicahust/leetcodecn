package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-05 下午11:55<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int left = 0;
        int right = A.length - 1;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] % 2 == 0) {
                result[left] = A[i];
                ++left;
            } else {
                result[right] = A[i];
                --right;
            }
        }
        return result;
    }
}
