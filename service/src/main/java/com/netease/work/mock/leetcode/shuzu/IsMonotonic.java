package com.netease.work.mock.leetcode.shuzu;

/**
 * description:
 * Date: 2019-10-26 下午11:35<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsMonotonic {
    public static void main(String[] args) {
        System.out.println(new IsMonotonic().isMonotonic(new int[]{}));
    }

    public boolean isMonotonic(int[] A) {
        if (A.length == 0) {
            return true;
        }
        boolean isSequence = true;
        for (int i = 1; i < A.length; ++i) {
            if (A[i - 1] <= A[i]) {
                continue;
            } else {
                isSequence = false;
                break;
            }
        }
        if (isSequence) {
            return true;
        }
        for (int i = 1; i < A.length; ++i) {
            if (A[i - 1] >= A[i]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
