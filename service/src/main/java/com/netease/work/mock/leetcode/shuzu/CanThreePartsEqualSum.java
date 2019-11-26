package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-26 下午9:36<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class CanThreePartsEqualSum {

    public static void main(String[] args) {
        System.out.println(new CanThreePartsEqualSum().canThreePartsEqualSum(new int[]{0,2,1,-6,6,-7,9,1,2,0,1}));
    }

    public boolean canThreePartsEqualSum(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int[] left = new int[A.length];
        left[0] = A[0];
        int[] right = new int[A.length];
        right[A.length - 1] = A[A.length - 1];
        for (int i = 1; i < A.length; ++i) {
            left[i] = left[i - 1] + A[i];
        }
        for (int j = A.length - 2; j > 0; --j) {
            right[j] = A[j] + right[j + 1];
        }
        int sum = left[A.length - 1];
        for (int i = 0; i < left.length; ++i) {
            for (int j = right.length - 1; j > i; --j) {
                if (left[i] == right[j] && sum - left[i] - right[j] == left[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
