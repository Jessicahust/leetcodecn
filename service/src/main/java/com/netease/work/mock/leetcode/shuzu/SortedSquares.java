package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-05 下午11:50<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class SortedSquares {

    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int i = 0;
        int j = A.length - 1;
        int index = result.length -1;
        while (i <= j) {
            if (A[j] * A[j] <A[i]*A[i]){
                result[index] = A[i]*A[i];
                --index;
                ++i;
            }else {
                result[index] = A[j]*A[j];
                --index;
                --j;
            }
        }
        return result;
    }
}
