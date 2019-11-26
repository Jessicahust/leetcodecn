package com.netease.work.mock.leetcode.shuzu;

import java.util.Arrays;

/**
 * description:
 * Date: 2019-10-26 下午11:59<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class LargestSumAfterKNegations {

    public static void main(String[] args) {
        System.out.println(new LargestSumAfterKNegations().largestSumAfterKNegations(new int[]{2,-3,-1,5,-4}, 2));
    }

    public int largestSumAfterKNegations(int[] A, int K) {
        if (A.length == 0) {
            return 0;
        }
        Arrays.sort(A);
        int sum = 0;
        int count = 0;
        int min = Math.abs(A[0]);
        for (int i = 0; i < A.length; ++i) {
            min = Math.min(Math.abs(A[i]), min);
            if (A[i] < 0 && count < K) {
                A[i] = -A[i];
                ++count;
            }
            sum += A[i];
        }
        if (count == K) {
            return sum;
        } else if ((K - count) % 2 != 0) {
            sum -= 2 * min;
        }
        return sum;
    }
}
