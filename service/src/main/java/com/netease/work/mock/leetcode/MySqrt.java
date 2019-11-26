package com.netease.work.mock.leetcode;

/**
 * description:
 * Date: 2019-09-16 下午12:08<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class MySqrt {

    public static void main(String[] args) {
        System.out.println(new MySqrt().mySqrt(2147395599));
    }

    public int mySqrt(int x) {
        if (x <= 0)
            return 0;
        long left = 1;
        long right = x / 2 + 1;
        while (left <= right) {
            long mid = left + ((right - left) >> 1);
            long multi = mid * mid;
            if (multi == x) {
                return (int) mid;
            }
            if (multi < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) right;
    }
}
