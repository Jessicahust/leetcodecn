package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-10-02 下午5:59<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class IsPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long left = 2;
        long right = num / 2 + 1;
        while (right >= left) {
            long mid = (left + right) >> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
